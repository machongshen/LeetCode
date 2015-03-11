package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>> ();
        if(root == null) return res;
        Queue<TreeNode> level = new LinkedList<TreeNode> ();
        level.offer(root);
        int curlevel = 1;
        int nxtlevel = 1;
        List<Integer> list = new ArrayList<Integer> ();
        while (!level.isEmpty()){
            curlevel = nxtlevel;
            nxtlevel = 0;
            for (int i = 0; i < curlevel; i++){
                TreeNode curnode = level.poll();
                if (curnode.left != null){
                   level.offer(curnode.left);
                   nxtlevel++; 
                }
                if (curnode.right != null){
                   level.offer(curnode.right);  
                   nxtlevel++; 
                }
                list.add(curnode.val);
            }
            res.add(list);
            list = new ArrayList<Integer>();
        }
        return res;
    }
    public static void main(String[] args) {  
//      TreeNode root = new TreeNode(1);  
//      TreeNode n1 = new TreeNode(2);  
//      TreeNode n2 = new TreeNode(3);  
//      TreeNode n3 = new TreeNode(4);  
//      TreeNode n4 = new TreeNode(5);  
//      root.left = n1;  
//      root.right = n2;  
//      n1.left = n3;  
//      n1.right = n4;  
          
        // {1,2,3,4,#,#,5}  
        TreeNode root = new TreeNode(1);  
        TreeNode n1 = new TreeNode(2);  
        TreeNode n2 = new TreeNode(3);  
        TreeNode n3 = new TreeNode(4);  
        TreeNode n4 = new TreeNode(5);  
        root.left = n1;  
        root.right = n2;  
        n1.left = n3;  
        n2.right = n4;  
        System.out.println(levelOrder(root));  
//      System.out.println(levelOrder(null));  
    } 
}
