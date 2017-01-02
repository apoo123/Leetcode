public class Solution {
    
    public int climbStairs(int n) {
        int[] tmp=new int[n+1];
        if(n<2)
        return 1;
       if(n==2)
       return 2;
       tmp[0]=0;
       tmp[1]=1;
       if(n>2)
       tmp[2]=2;
       for (int i = 3; i <= n; i++){
            tmp[i] = tmp[i-1] + tmp[i-2];
        }
        return tmp[n];
    }
}