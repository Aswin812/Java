
public class fibonacci {
    int i=0,j=1,temp=0;
    public void rec(int n){
        if(i==n || i>n){
            System.out.print(i + " ");
            return ;
        }
        else{
            System.out.print(i + " ");
            temp=i+j;
            i=j;
            j=temp;
            rec(n);
        }
    }
    public static void main(String[] args) {
        fibonacci obj=new fibonacci();
        obj.rec(13);
    }    
}
