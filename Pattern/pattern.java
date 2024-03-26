public class pattern {
    public static void main(String[] args) {
        int n=8;
        int x=n*2-1;
        int temp=1;
        int x1= x+(n-temp)-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j){
                    System.out.print(" " + i);
                }
                else if(j==n && j!=i){
                    System.out.print("  " + x);
                    x--;
                }
                else if(i==temp && (j<n && j>temp)){
                    System.out.print(" " + x1);
                        x1--;
                }
                else{
                    System.out.print("   ");
                }
            }
            x1+=n-i;
            temp+=1;
            System.out.println();
        }
    }    
}
