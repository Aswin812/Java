
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                count++;
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println(count);

        
        // int count=0;
        // for(int i=1;i<arr.length; i++){
        //     count++;
        //     int p=arr[i-1];
        //     int c=arr[i];
        //     if(p>c){
        //         arr[i-1]=c;
        //         arr[i]=p;
        //         i=0;
        //     }
        // }
        // System.out.println(count);
        // for(int x:arr)System.out.print(x+" ");
    }    
}
