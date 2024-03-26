import java.util.Arrays;

public class spiralPattern {
    public static void main(String[] args) {
        int n=6;
        int[][] arr=new int[n][n];
        int count=1,col=n-1, row=0;
        while (count <= n*n) {
            for(int i=row; i<=col; i++){
                arr[row][i]=count++;
            }
            for(int j=row+1; j<=col; j++){
                arr[j][col]=count++;
            }
            for(int k=col-1; k>=row; k--){
                arr[col][k]=count++;
            }
            for(int l=col-1; l>=row+1; l--){
                arr[l][row]=count++;
            }
            row++;
            col--;
        }        
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
