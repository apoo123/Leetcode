public class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maximum=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
            min=prices[i];
            maximum=Math.max(maximum,prices[i]-min);
        }
       
     return maximum;   
    }
}