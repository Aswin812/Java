
public class armstrongNumber {
    public static void main(String[] args) {
        int input=153;
        int num=input;
        int sum=0;
        int digit=(int)Math.log10(input)+1;
        while (num>0) {
            int temp=num%10;
            sum+=Math.pow(temp,digit);
            num/=10;
        }
        System.out.println(input==sum);
    }    
}
