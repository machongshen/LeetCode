package Tree;

public class ArrayToBST {
	public TreeNode sortedArrayToBST(int[] num) {
	       
        return sortedBST(num, 0, num.length-1);
    }
    private TreeNode sortedBST(int[]num, int start, int end){
        
        if (start>end){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode root = new TreeNode (num[mid]); 
        root.left = sortedBST(num,start,mid-1);
        root.right = sortedBST(num,mid+1,end);
        return root;
    }
}
