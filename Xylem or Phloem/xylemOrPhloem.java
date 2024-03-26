
public class xylemOrPhloem {
    public static void main(String[] args) {
        int input=12348;
        System.out.print(input);
        int i=0;
        String s=""+input;
        int temp=0,sum1=0,sum2=0;
        while (i<s.length()) {
            temp=input%10;
            if(i==0 || i==s.length()-1)
                sum1+=temp;
            else
                sum2+=temp;
        
            input/=10;
            temp=0;
            i++;
        }
        if(sum1==sum2)System.out.println(" is a Xylem Number");
        else System.out.println(" is a Phloem Number");
        // String input="253119";
        // String[] arr=input.split("");
        // int temp=0;
        // int sum1=0,sum2=0;
        // String output="";
        // for(int i=0; i<arr.length; i++){
        //     temp=Integer.parseInt(arr[i]);
        //     if(i==0||i==arr.length-1){
        //         sum1+=temp;
        //     }
        //     else{
        //         sum2+=temp;
        //     }
        // }
        // output=(sum1==sum2)?input+" is a Xylem Number.": input+" is a Phloem Number";
        // System.out.println(output);
    }    
}
