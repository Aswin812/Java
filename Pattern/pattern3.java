
public class pattern3 {
    public static void main(String[] args) {
        int n=6;
        int[][] arr=new int[n][];
        arr[0]=new int[1];
        arr[0][0]=1;
        System.out.println(arr[0][0]);
        int j=0;
        for(int i=1; i<arr.length; i++){
                arr[i]=new int[i+1];
                arr[i][j]=arr[i-1][arr[i-1].length-1];
                System.out.print(arr[i][j]+" ");
                j++;
            while (j<arr[i].length) {
                arr[i][j]=arr[i][j-1]+arr[i-1][j-1];
                System.out.print(arr[i][j]+" ");
                j++;
            }
            j=0;
            System.out.println();
        }
    }    
}
