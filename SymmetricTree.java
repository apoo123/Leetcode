public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
        return symmetric(root.right,root.left);
    }
    
    public boolean symmetric(TreeNode a,TreeNode b){
        if(a==null && b==null)
        return true;
        else if(a==null || b==null)
        return false;
        
        if(a.val!=b.val)
        return false;
        
        else{
            boolean t1=symmetric(a.right, b.left);
            boolean t2=symmetric(a.left, b.right);
            if(t1 && t2)
            return true;
        }
    return false;
    }
}