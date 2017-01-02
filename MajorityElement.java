public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> count=new HashMap();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count.containsKey(nums[i])){
                int a=count.get(nums[i]);
                a++;
                count.replace(nums[i],a);
            }
            else{
                count.put(nums[i],1);
            }
            if(count.get(nums[i])>(n/2)){
            return nums[i];
            }
        }
    return 1;
    }
}