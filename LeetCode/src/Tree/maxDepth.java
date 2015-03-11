package Tree;

public class maxDepth {
//	private int maxdpth = 1;
//	private int curdpth = 1;
//    public int maxDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        if (root.left==null&&root.right==null){
//            return 1;
//        }  
//        dfs(root,maxdpth,curdpth);
//        return maxdpth;
//    }
//    private void dfs (TreeNode root, int maxdpth, int curdpth){
//    	if (root !=null)
//        {   if(root.right!=null&&root.left!=null)
//            { 
//                this.curdpth++;
//                if (curdpth>maxdpth)
//                {
//                	this.maxdpth = curdpth;
//                }
//                dfs(root.left,maxdpth,curdpth);
//                dfs(root.right,maxdpth,curdpth);
//            }
//            if (root.right==null&&root.left!=null)
//            {
//            	
//            	this.curdpth++;
//               if (curdpth>maxdpth)
//                {
//            	   this.maxdpth = curdpth;
//                }
//               dfs(root.left,maxdpth,curdpth);
//            }
//            if (root.right!=null&&root.left==null)
//            { 
//            	this.curdpth++;
//               if (curdpth>maxdpth)
//                {
//            	   this.maxdpth = curdpth;
//                }
//               dfs(root.left,maxdpth,curdpth);
//            }
//    }
//}
	public int maxDepth(TreeNode root) {
		if (root!=null)
		
			return Math.min(maxDepth(root.left), maxDepth(root.right))+1;
		else 
			return 0;
				
		
		
	}
	
    public static void main (String args[]){
    	maxDepth a = new maxDepth();
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	a.maxDepth(root);
    	System.out.println(a.maxDepth(root));
    } 
}
