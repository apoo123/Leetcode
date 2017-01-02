public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(m.containsKey(a)){
                return true;
            }
            else
                m.put(a,0);
        }
    return false;
    }
}