public class Solution {
   static String str="";
    public String convertToTitle(int b) {
		String ans="";
		ans=find(b);
		return ans;
	}
	
	public static String find(int n){
		int mod=0;
		int b=n;
		String a="",ans="";
		if(n>26){
			n=n/26;
			if(b%26==0)
			n=n-1;
		}
		if(b%26!=0)
			mod=b%26;
		else
			mod=26;
		mod=mod+64;
		 
		 char character = (char) mod;
	     a= Character.toString(character);
	     //System.out.println(a);
	     if(b>26)
	     ans=find(n);
	     str=ans+a;
	return str;
}
}