
public class missingLetter {
    public static void main(String[] args) {
        char[] arr={'A','C','E','F','H'};
        char output=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]+1!=arr[i+1]){
                output+=arr[i]+1;
                // int temp=arr[i]+1;
                // char t=(char)temp;
                System.out.println(output);
                break;
            }
        }
    }    
}
