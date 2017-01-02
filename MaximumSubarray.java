public class Solution {
    public int maxSubArray(int[] nums) {
        int max_end=nums[0],max_so_far=nums[0];
        
        for(int i=1;i<nums.length;i++){
            max_end=Math.max(max_end+nums[i],nums[i]);
            max_so_far=Math.max(max_end,max_so_far);
        }
    return max_so_far;
    }
}