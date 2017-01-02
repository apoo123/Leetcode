public class Solution {
    public void moveZeroes(int[] nums) {
        int[] answer=new int[nums.length];
        int j=nums.length-1,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               int a=nums[i];
                answer[k]=a;
                k++;
            }
            else{
                answer[j]=nums[i];
                j--;
            }
            
        }
    for(int i=0;i<nums.length;i++){
        nums[i]=answer[i];
    }
    }
}