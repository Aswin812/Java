
public class reverseWord {
    public static void main(String[] args) {
        String input="hello world";
        String[] arr=input.split(" ");
        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length()-1; j>=0; j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }    
}
