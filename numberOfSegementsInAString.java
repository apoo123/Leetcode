public class Solution {
    public int countSegments(String s) {
       int seg=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=' '){
               if(i==0)
               seg++;
               if(i!=0 && s.charAt(i-1)==' ')
               seg++;
           }
       }
    return seg;
    }
}