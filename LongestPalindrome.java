public class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> m=new HashMap();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                int a=m.get(s.charAt(i));
                m.replace(s.charAt(i),a+1);
            }
            else
            m.put(s.charAt(i),1);
        }
        
        int val=0,max=0;
        int flag=0;
        Iterator it=m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair=(Map.Entry) it.next();
            if((int) pair.getValue()%2==0)
            val+=(int) pair.getValue();
            else{
               val+=(int) pair.getValue() -1;
               flag=1;
            }
        }
   // val+=max;
   if(flag==1)
    return val+1;
    else
    return val;
    }
}