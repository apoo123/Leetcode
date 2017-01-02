public class Solution {
    public void rotate(int[][] matrix) {
        int[][] a1=new int[matrix.length][matrix.length];
        int[][] a2=new int[matrix.length][matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                a1[i][j]=matrix[j][i];
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                a2[i][j]=a1[i][matrix.length-1-j];
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=a2[i][j];
            }
        }
    }
}