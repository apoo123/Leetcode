public class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> num=new HashSet();
        while(!num.contains(n)){
            num.add(n);
            n=get(n);
            if(n==1)
                return true;
        }
    return false;
    }
    
    public static int get(int n){
        int sum1=0;
        while(n>0){
        sum1+=(n%10) * (n%10);
        n=n/10;
        }
        return sum1;
    }
}