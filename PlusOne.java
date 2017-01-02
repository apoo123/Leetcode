public class Solution {
    public int[] plusOne(int[] digits) {
       int[] arr=new int[digits.length+1];
       int n=digits.length,flag=1;
       
       for(int i=n-1;i>=0;i--){
           if(digits[i]==9 && flag==1) {
               arr[i+1]=0;
               flag=1;
               if(i==0)
               arr[0]=1;
           }
           else if(flag==1){
               arr[i+1]=digits[i]+1;
               flag=0;
           }
           else{
               arr[i+1]=digits[i];
               flag=0;
           }
       }
       int[] a=new int[n];
       if(arr[0]==0){
           for(int i=1;i<n+1;i++)
           a[i-1]=arr[i];
       }
       if(arr[0]==0)
       return a;
      return arr;
    }
}