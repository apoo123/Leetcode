public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                int a=m.get(nums[i]);
                m.replace(nums[i],a+1);
            }
            else
            m.put(nums[i],1);
        }
        
        Iterator it=m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair=(Map.Entry) it.next();
            if((Integer) pair.getValue()==1)
            return (Integer) pair.getKey();
        }
     return 0;   
    }
}