package Tree;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        if (root == null)
        {
            return true;
        }
        else 
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode left, TreeNode right)
    {
        if (left == null&& right == null)
        {
            return true;
        }
        if(right !=null && left ==null)
        {
            return false;
        }
        if (right == null &&left!=null )
        {
            return false;
        }
        if (right.val == left.val)
        {
            return helper(left.left,right.right)&&helper(left.right,right.left);
        }
        else return false;
    }
}
