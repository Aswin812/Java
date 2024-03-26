public class palindrome {
    public static void main(String[] args) {
        String str="Madam, I'm Adam";
        String input=str.toLowerCase();
        int n=input.length()-1;
        String output="";
        for(int i=n; i>=0; i--){
            if(Character.isLetter(input.charAt(i)))
            output+=""+input.charAt(i);
        }
        input="";
        for(int i=output.length()-1; i>=0; i--)input+=""+output.charAt(i);
        if(input.equals(output))System.out.println(str+" is a palindrome");
        else System.out.println(str+" is not a palindrome");
    }
}
