
public class divideString {
    public static void main(String[] args) {
        String input="adfgjklzxcvbnmwertyuio";
        int count=0;
        for(int i=0; i<input.length(); i++){
            count++;
            System.out.print(input.charAt(i));
            if(count==5){
                count=0;
                System.out.println();
            }
        }
    }    
}
