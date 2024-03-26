import java.util.Scanner;
public class diamondLetter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=s.nextInt();
        int last=n;
        for(int i=1; i<=n*2; i++,last--){
            char temp='A';
            for(int j=1; j<=n; j++){
                if(j>=last){
                    System.out.print(temp++ +" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i>=n)last+=2;
            System.out.println();
        }
    }
}
