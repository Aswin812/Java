
public class saddlePoint {
    public static void main(String[] args) {
        int[][] arr={{6,3,1},{9,7,8},{2,4,5}};
        int i=0;
        int j=0;
        int min=0;
        while (i<arr.length && j<arr.length-1) {
            if(arr[i][j]>arr[i][j+1]){
                min=arr[i][j+1];
                if(j+1==arr.length-1){
                    for(int k=j; k<arr.length; k++){
                        if(arr[j][k]<arr[j][k+1]){
    
                        }
                    }
                    j=0;
                }
            }
            else{
                j++;
            }
        }
    }    
}
