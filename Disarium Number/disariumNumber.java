import java.util.Scanner;
public class disariumNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=s.nextInt();
        String str=""+num;
        int n=str.length(),sum=0;
        while (num>0) {
            int temp=num%10;
            sum+=Math.pow(temp, n);
            n--;
            num/=10;
        }
        if (str.equals(""+sum)) System.out.println(str+" is a  Disarium Number");
        else System.out.println(str+" is not a  Disarium Number ");
    }    
}
