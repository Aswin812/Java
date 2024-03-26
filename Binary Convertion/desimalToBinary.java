import java.util.Scanner;
public class desimalToBinary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Desimal Number : ");
        int n=input.nextInt();

        String temp="";
        String binary="";

        while(n>=1){
            temp+=n%2;
            n=n/2;            
        }
        for(int i=temp.length()-1; i>=0; i--){
            binary+=temp.charAt(i);
        }
        System.out.println(binary);
    }
}
