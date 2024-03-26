public class pattern2 {
    public static void main(String[] args) {
        int n=3;
        int x=n*2;
        int y=n-1;
        int n1=1;
        int n2=n*n+1;
        for(int i=0; i<n; i++,x--){
            int count=1;
            for(int j=0; j<n*2; j++){
                if(j<i || j>=x){
                    System.out.print("  ");
                }
                else{
                    if(j<n){
                        System.out.print(n1);
                        if(j<n-1)System.out.print("*");
                        n1++;
                    }
                    else if(j>=n){
                        System.out.print("*"+n2);
                        n2++;
                        count++;
                    }
                }
            }
            n2-=count+y/2;
            y--;
            System.out.println("");
        }
    }    
}
