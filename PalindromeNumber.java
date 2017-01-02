public class Solution {
    public boolean isPalindrome(int x) {
     long rev=0;
     long pal=(long) x;
     while(pal!=0){
         
        long rem=pal%10;
         rev=rev*10+rem;
         pal=pal/10; 
     }
        
    if(x<0)
    return false;
        
      if(rev==x)
      return true;
      else 
      return false;
      
     }
}