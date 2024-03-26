import java.util.Arrays;

public class zeroToEnd {
    public static void main(String[] args) {
        int arr[]={1,2,2,0,3,0,4,0,0,7,0,3};
            int x=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[x];
                    arr[x]=temp;
                    x++;
                } 
            }
            System.out.println(Arrays.toString(arr));
    }
}
