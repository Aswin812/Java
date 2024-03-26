
public class tribonacci {
    public static void main(String[] args) {
        int[] arr={1,1,1};
        int n=8;
        int[] output=new int[n];
        for(int i=0; i<n; i++){
            if(i<arr.length)
                output[i]=arr[i];
            else
                output[i]=output[i-1]+output[i-2]+output[i-3];
                
            System.out.print(output[i]+" ");
        }
        
    }    
}
