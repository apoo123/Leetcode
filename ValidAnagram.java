public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        
        int[] countNumber=new int[26];
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        
        for(int i=0;i<s.length();i++){
                countNumber[s1[i]-'a']++;
                countNumber[t1[i]-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(countNumber[i]!=0)
            return false;
        } 
        return true;
    }
}