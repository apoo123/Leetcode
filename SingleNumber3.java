public class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> set=new ArrayList();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
            set.remove((Object) nums[i]);
            else
            set.add(nums[i]);
        }
        ans[0]=set.get(0);
        ans[1]=set.get(1);
    return ans;
    }
}