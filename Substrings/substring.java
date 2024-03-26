import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Input : ");
        String input=s.nextLine();
        StringBuffer temp=new StringBuffer();
        for(int i=0; i<input.length(); i++){
            int j=i;
            while (j!=input.length()) {
                temp.append(input.charAt(j));
                System.out.println(temp);
                j++;
            }
            temp.delete(0,temp.length());
        }
    }    
}
