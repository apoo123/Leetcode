public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] tokens=str.split("\\s+");
        if(pattern.length()!=tokens.length)
        return false;
        Map<Character,String> m=new HashMap();
        for(int i=0;i<pattern.length();i++){
            if(m.containsKey(pattern.charAt(i))){
                String a=m.get(pattern.charAt(i));
                if(!a.equals(tokens[i]))
                return false;
            }
            else if(m.containsValue(tokens[i]))
            return false;
                
        m.put(pattern.charAt(i),tokens[i]);
        }
    return true;
    }
}