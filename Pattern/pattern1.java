public class pattern1 {
    public static void main(String[] args) {
        int x = 1;
        int n=4;
        int t=n-1;
        int num=1;
        for (int i = 1; i <= n*2; i++,x++) {
            for (int j = 1; j <= n; j++) {
                if(n<j){
                    System.out.print(" ");
                }
                else if(j <= x) {
                    System.out.print(num+" ");
                    num--;
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i<n){
                num+=t;
                t+=n/2;
            }
            else if(i==n){
                num+=n;
            }
            
            
            x=(i>n)?x-2:(i==n)?x-1:x;
            System.out.println();
        }
    }
}
