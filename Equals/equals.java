import java.util.Scanner;
public class equals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Word : ");
        String txt1=input.nextLine();
        System.out.print("Enter Second Word : ");
        String txt2=input.nextLine();
        int count=0;
        if(txt1.length()==txt2.length()){
            for(int i=0; i<txt1.length(); i++){
                    if(txt1.charAt(i)==txt2.charAt(i)){
                        count+=1;
                    }
                    else{
                        count-=1;
                    }
            }
            if(count==txt1.length()){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("False");
        }
    }
}
