
public class persistentBugger {
    public static void main(String[] args) {
        int n=16732;
        int sum=1; 
        int count=0;
        while(n>9){
            int temp=n%10;
            n=n/10;
            sum*=temp;
            if(n<10){
                count+=1;
                sum*=n;
                n=sum;
                sum=1;
            }
        }
        System.out.println(count);
    }    
}
