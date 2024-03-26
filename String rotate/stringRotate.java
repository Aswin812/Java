import java.util.Scanner;
public class stringRotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String inp1=s.nextLine();
        System.out.print("Enter String 2 : ");
        String inp2=s.nextLine();
        StringBuffer str1=new StringBuffer(inp1);
        StringBuffer str2=new StringBuffer(inp1);
        System.out.print("Enter Rotate Count : ");
        int count1=s.nextInt(), count2=count1;
        int i=0;
        while (count1!=0) {
            char temp=str1.charAt(i);
            str1.deleteCharAt(i);
            str1.append(temp);
            count1--;
        }
        int j=inp2.length()-1;
        while (count2!=0) {
            char temp=str2.charAt(j);
            str2.deleteCharAt(j);
            str2.insert(0, temp);
            count2--;
        }
        System.out.println(inp2.equals(str1.toString()) || inp2.equals(str2.toString()));
    }    
}
