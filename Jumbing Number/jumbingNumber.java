public class jumbingNumber {
    public static void main(String[] args) {
        int n = 22;
        if(n<12){
            System.out.println(n);
        }
        for (int i = 12; i <= n; i += 2) {
            String str = String.valueOf(i);
            String arr[] = str.split("");
            str = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                str += arr[j];
            }
            int t=i;
            i=Integer.parseInt(str);
            if(i>n){
                System.out.println(t);
            }
        }
    }
}