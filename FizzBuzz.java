public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al=new ArrayList();
        for(int i=1;i<=n;i++){
            String str="";
            if(i%3==0){
                str=str+"Fizz";
            }
            if(i%5==0){
                str=str+"Buzz";
            }
            if(i%3!=0 && i%5!=0)
            str=str+i;
        al.add(str);
        }
    return al;
    }
}