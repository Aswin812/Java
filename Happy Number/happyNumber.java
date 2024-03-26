
public class happyNumber {
    public static void main(String[] args) {
        int input=64;
        int num=input;
        int temp1=0,temp2=0;
        int sum=0;
        while (true) {
            System.out.println(input);
            temp1=input%10;
            temp2=input/10;
            sum+=Math.pow(temp1, 2)+Math.pow(temp2, 2);
            if(temp2>=10){
                input=temp2;
                sum=0;
            }
            else if(sum==1){
                System.out.println(num+" - is a Happy Number");
                break;
            }
            else if(sum>1 && sum<=9){
                System.out.println(num+" - is Not Happy Number");
                break;
            }
            else{
                input=sum;
                temp1=0;
                temp2=0;
                sum=0;
            }
        }
    }
}
