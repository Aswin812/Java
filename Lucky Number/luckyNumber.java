
public class luckyNumber {
    public static void main(String[] args) {
        int num=9801;
        int sum=(num%100)+(num/100);
        if(num==(sum*sum)) System.out.println("True");
        else System.out.println("False");
    }    
}
