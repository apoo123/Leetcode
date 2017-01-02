public class Solution {
    public static boolean isPalindrome(String s) {
       if(s.isEmpty())
	        return true;
	       
	        String s1=s.replaceAll("[\\W++]","").toLowerCase();
	         int n=s1.length();
	         if(n==1 || n==0)
	         return true;
	        for(int i=0;i<=n/2;i++){
	            if(s1.charAt(i)!=s1.charAt(n-1-i))
	            return false;
	        }
	    return true;
    }
}