
public class addPalindrome {

     static int temp=0;
    public static void reverse(int n){
        temp=temp*10+n%10;
        n/=10;
        if(n>0) reverse(n);

    }
    public static void main(String[] args) {
        int num=333;
        while (true) {
            reverse(num);
            System.out.print(num+" + "+temp +" = ");
            int sum=temp+num;
            System.out.println(sum);
            temp=0;
            reverse(sum);
            if(sum==temp){
                System.out.println(true);
                break;
            }
            else{
                num=sum;
                temp=0;
            }
            
        }
    }    
}
