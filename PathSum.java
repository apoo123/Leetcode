public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        
        if(root==null)
        return false;
        
        if(root.left==null && root.right==null && root.val==sum)
        return true;
        
        boolean a=hasPathSum(root.right,sum-root.val);
        boolean b=hasPathSum(root.left,sum-root.val);
        
        if(a || b)
        return true;
        else
        return false;
    }
}