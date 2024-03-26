
public class rotateArray {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8,9};
        int rotate=3;
        int[] arr=new int[rotate];
        for(int i=0; i<rotate; i++){
            arr[i]=input[i];
        }
        int j=0;
        for(int i=0; i<input.length; i++){
            if((rotate+i)>=input.length){
                input[i]=arr[j];
                j++;
            }
            else{
            input[i]=input[rotate+i];
            }
            System.out.print(input[i]+" ");
        }
    }    
}
