import java.util.Scanner;
public class pronicNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=s.nextInt();
        int sum=0;
        int i=1;
        while (sum<=num) {
            sum=i*(i+1);
            if(sum==num){
                System.out.println(i+" x "+(i+1) +" = " +num);
                System.out.println(num+" is a Pronic Number");
                break;
            }
            else i+=1;
        }
        if (sum>num) 
            System.out.println(num+" is not a Pronic Number");
    }    
}
