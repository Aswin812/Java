import java.util.Scanner;
public class removeChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=s.nextLine();
        System.out.print("Enter Remove String : ");
        String r=s.nextLine();
        String[] arr=r.split("");
        for(int i=0; i<str.length(); i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                String temp=String.valueOf(str.charAt(i));
                if(temp.equals(arr[j])){
                    count++;
                    break;
                }
            }
            if(count!=1){
                System.out.print(str.charAt(i));
            }
        }
    }    
}
