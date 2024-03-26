
public class pairSum {
    public static void main(String[] args) {
        int[] input={2,3,0,4,5,6,7,0,9};
        int temp=0;
        for(int i=0; i<input.length-1; i++){
            if(temp<input[i]+input[i+1]){
                temp=input[i]+input[i+1];
                i++;
            }
        }
        System.out.println(temp);
    }    
}
