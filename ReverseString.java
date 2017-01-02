public class Solution {
    public String reverseString(String s) {
        if(s.isEmpty()){
            String y=""; 
        return y;
        }
        char[] ans=s.toCharArray();
       
        int n=s.length();
         char[] ans2=new char[n];
        for(int i=0;i<n/2+1;i++){
            ans2[i]=ans[n-i-1];
            ans2[n-1-i]=ans[i];
        }
        String a=String.valueOf(ans2);
        return a;
    }
}