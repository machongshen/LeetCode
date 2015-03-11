package Tree;

import java.util.ArrayList;
import java.util.List;

public class Pathsum {
    private int afsum = 0;
    private List<Integer> sumlist = new ArrayList<Integer> ();
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)
        {
        	return false;
        }
        if (root.left==null&&root.right == null)
        {
        	return  root.val ==sum;
        }
        if (root.val > sum )
        	return false;
    	return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        
    }
    private void dfs (TreeNode root){
       
        if (root.left==null&&root.right==null){
            this.afsum+=root.val;
            this.sumlist.add(this.afsum);
        }
        if (root.left!=null&&root.right==null)
        {   this.afsum += root.val;
            dfs(root.left);
        }
        if (root.left==null&&root.right!=null)
        {   
            this.afsum += root.val;
            dfs(root.right);
        }
        if (root.left!=null&&root.right!=null)
        {
            this.afsum += root.val;
            dfs(root.left);
            dfs(root.right);
        }
    }
    public static void main (String args[]){
    	Pathsum a = new Pathsum();
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);
    	a.hasPathSum(root,3);
    	System.out.println(a.hasPathSum(root,3));
    } 
}