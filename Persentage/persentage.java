
public class persentage {
    public static void main(String[] args) {
        float Ucase=0,Lcase=0,digit=0,Schar=0;
        String input="aaAA##77";
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)>=65 && input.charAt(i)<=90)Ucase++;
            else if(input.charAt(i)>=97 && input.charAt(i)<=122)Lcase++;
            else if(input.charAt(i)>=48 && input.charAt(i)<=57)digit++;
            else if(input.charAt(i)!=' ')Schar++;
        }
        Ucase=(Ucase*100)/input.length();
        Lcase=(Lcase*100)/input.length();
        digit=(digit*100)/input.length();
        Schar=(Schar*100)/input.length();
        System.out.println(Ucase+"% "+Lcase+"% "+digit+"% "+Schar+"%");
    }
}
