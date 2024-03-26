
public class leaders {
    public static void main(String[] args) {
        int[] input={8, 23, 19, 21, 15, 6, 11};
        int num=0;
        for(int i=input.length-1; i>0; i--){
            if(input[i]>num){
                num=input[i];
                System.out.print(input[i]+" ");
            }
        }
    }    
}
