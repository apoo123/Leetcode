public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int a=guess(n/2);
        int up=n,low=0,mid=0;
        mid=(up+low)/2;
        while(a!=0){
            if(a==1){
            if(low!=mid)
            low=mid;
            else
            low=up;
            }
            if(a==-1){
            up=mid;
            }
        mid=low+ ((up-low)/2);
        a=guess(mid);
        }
    return mid;
    }
}