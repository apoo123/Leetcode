public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        
        int depth=1+ Math.max(maxDepth(root.left),maxDepth(root.right));
        
        return depth;
        
    }
}