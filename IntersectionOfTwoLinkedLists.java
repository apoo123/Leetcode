public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersect=null;
        if(headA==null || headA.next==null)
        return intersect;
        
        if(headB==null || headB.next==null)
        return intersect;
        
        if(headA==headB){
            intersect=headA;
            intersect.next=getIntersectionNode(headA,headB);
        }
        else{
            intersect=getIntersectionNode(headA,headB);
        }
    
    return intersect;
    }
}