public class Solution {
    public int minDepth(TreeNode root) {
       int a=0;
        if(root==null)
        return 0;
        
        if(root.right==null)
        a=1+minDepth(root.left);
        
        else if(root.left==null)
        a=1+minDepth(root.right);
       
        else
        a=1+ Math.min(minDepth(root.left),minDepth(root.right));
        return a;
    }
}