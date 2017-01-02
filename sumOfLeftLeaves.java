public class Solution {
    static int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
        return 0;
        int sum=0;
        
        if(root.left!=null){
        if(root.left.left==null && root.left.right==null)
        sum+= root.left.val;
        }
        
        sum+=sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        
    return sum;
    }
}