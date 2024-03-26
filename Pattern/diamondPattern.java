// import java.util.Scanner;
// public class diamondPattern {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int n=input.nextInt();

//         for(int i=1; i<=n; i++){
//                 int temp=n-i;
//             for(int j=1; j<=n; j++){
//                 if(j<=temp){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("* ");
//                 }
                
//             }
//             System.out.println("");
//         }
//         for(int i=1; i<=n; i++){
//               int x=1;
//               for(int j=n; j<=n && j>0; j--){
//                 if(i<=x){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//                 x++;
//             }
//             System.out.println("");
//         }
//     }
// }

import java.util.Scanner;
public class diamondPattern {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=input.nextInt();
        
        for(int i=1; i<=n*2; i++){
            int x=n-i;
            int y=i-n;
            for(int j=1; j<=n; j++){
                if(i<=n && j>x){
                    System.out.print("* ");
                }
                else if(i>n && j>=y){
                    System.out.print("* ");  
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}




















