
public class reverseNumber {
    public static void main(String[] args) {
        int input = 3500400;
        String output="";
        if(input<0){
            output+="-";
            int temp=Math.abs(input);
            input=temp;
        }
        int num=10;
        int t=0;
        while (true) {
            int temp=0;
            if(input%num==0 && t==0){
                input/=10;
            }
            else{
                if(input>=num){
                    t+=1;
                    temp=input%num;
                    output+=String.valueOf(temp);
                    if(temp==0)input/=10;
                    else{
                         input-=temp;
                        input/=10;
                    }
                }
                else{
                    output+=String.valueOf(input);
                    break;
                }
            }
        }
        System.out.println(output);
        // String str1 = String.valueOf(input);
        // String str2 = "";
        // int n=str1.length()-1;
        // if (str1.charAt(0) == '-'){
        //     str2 += "-";
        // }
        // int count=0;
        // for (int i = n; i >= 0; i--) {
        //     if(str1.charAt(i)!='0'){
        //         count++;
        //     }
        //     if (Character.isDigit(str1.charAt(i)) && count!=0) {
        //         str2 += str1.charAt(i);
        //     }
        // }
        // System.out.println(str2);
    }
}
//