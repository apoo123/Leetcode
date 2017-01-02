public class Solution {
    public boolean canJump(int[] nums) {
   int n=nums.length;
   int reach=n-1;
   for(int i=n-2;i>=0;i--){
       if(i+nums[i]>=reach){
           reach=i;
       }
   }
    return reach<=0;
    }
}