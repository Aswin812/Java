
public class convertString {
    public static void main(String[] args) {
        String input="jwd12gwg534jd";
        int output=0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)>=48 && input.charAt(i)<=57){
                output+=input.charAt(i);
            }
        }
        System.out.println(output);
    }
}
