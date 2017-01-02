public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap();
        for(int i=0;i<nums.length;i++){
           int a= nums[i];
           if(m.containsKey(a)){
               int val=m.get(a);
               if(i-val<=k){
                return true;}
                else
                m.replace(nums[i],i);
           }
           else
           m.put(nums[i],i);
        }
    return false;
    }
}