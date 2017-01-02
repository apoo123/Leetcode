public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty())
        return 0;
        
        char[] a;
        String[] tokens=s.split("\\s+");
        if(tokens.length==0)
        return 0;
        else
        a=tokens[tokens.length-1].toCharArray();
        return a.length;
    }
}