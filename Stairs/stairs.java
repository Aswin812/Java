
public class stairs {
    public static void main(String[] args) {
        int n=45;
        int i=0, j=1, temp=0;
        int count=1;
        while (count<=n) {
            temp=i+j;
            i=j;
            j=temp;
            if(i>1)count++;
            if(count==n)System.out.println(i);
        }
    }    
}
