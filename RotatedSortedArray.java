public class Solution {
    public int findMin(int[] nums) {
        int a=Integer.MAX_VALUE;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<=nums[i-1] && nums[i]<=nums[i+1]){
            a=Math.min(a,nums[i]);
            
            }
        }
        
        a=Math.min(a,nums[nums.length-1]);
        a=Math.min(a,nums[0]);
        
        if(nums.length==1)
        a=nums[0];
        
        if(nums.length==2)
        a=Math.min(nums[0],nums[1]);
        
    return a;
    }
}