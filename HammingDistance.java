public class Solution {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int count=0;
        while(z!=0){
            int a=z&1;
            z>>=1;
            if(a==1)
            count++;
        }
    return count;
    }
}