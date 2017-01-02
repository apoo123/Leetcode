public class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            return i;
            
            if(i==0 && nums[i]>target)
            return 0;
            
            if(i>0 && nums[i]>target && nums[i-1]<target)
            return i;
        }
    return nums.length;
    }
}