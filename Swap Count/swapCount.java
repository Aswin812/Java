
public class swapCount {
    public static void main(String[] args) {
        int[] arr={5,3,6,8,4,1,9,2,7};
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
            System.out.println("Swap Count = "+count);
    }
}
