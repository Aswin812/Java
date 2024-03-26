import java.util.Scanner;;
public class harshadNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Numer : ");
        int inp=s.nextInt();
        int num=inp;
        int sum=0;
        while (num>0) {
            sum+=num%10;
            num/=10;
        }
        if(inp%sum==0)
            System.out.println(inp+" is a Harshad Number ");
        else
        System.out.println(inp+" is a Niven Number");

    }    
}
