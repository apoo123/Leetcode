public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        return true;
        else if(p==null || q==null)
        return false;
        if(p.val!=q.val)
        return false;
        
        boolean c1=isSameTree(p.left,q.left);
        boolean c2=isSameTree(p.right,q.right);
        
        if(c1 && c2)
        return true;
    return false;
        
    }
}