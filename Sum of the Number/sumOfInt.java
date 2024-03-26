
public class sumOfInt {
     static int sum=0;
    public static void sum(int n){
        int temp=n%10;
        sum+=temp;
        n=n/10;
        if(n>9) sum(n);
        else sum+=n;
    }
    public static void main(String[] args) {
        sumOfInt.sum(-12);
        System.out.println(sum);
    }    
}
