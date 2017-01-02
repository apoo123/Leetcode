public class Solution {
    public int[][] generateMatrix(int n) {
        int num=1,row=0,col=-1;
        int[][] ans=new int[n][n];
        
        while(n!=0){
         for(int i=0;i<n;i++){
             col++;
             ans[row][col]=num;
             num++;
         }
         n--;
         if(n==0)
         break;
         for(int i=0;i<n;i++){
             row++;
             ans[row][col]=num;
             num++;
         }
         for(int i=0;i<n;i++){
             col--;
             ans[row][col]=num;
             num++;
         }
         n--;
         if(n==0)
         break;
         for(int i=0;i<n;i++){
             row--;
             ans[row][col]=num;
             num++;
         }
        }
        
    return ans;
    }
}