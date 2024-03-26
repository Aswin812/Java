
public class jumbingIndex {
    public static void main(String[] args) {
        int[] input= {1,2,2,0,5,8,9};
        int count=0,num=0;
        for(int i=0; i<input.length;){
            if(input[i]<=0){
                count=0;
                break;
            }
            num+=input[i];
            i+=num;
            count++;
        }
        System.out.println(count);
    }    
}
