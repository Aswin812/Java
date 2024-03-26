
public class stringIntoParis {
    public static void main(String[] args) {
        String input="abcde";
        input+=(input.length()%2!=0)?"_":"";
        String[] arr=new String[input.length()/2];
        int j=0;
        for(int i=0; i<arr.length; i++,j++) {
            arr[i]=input.charAt(j)+""+input.charAt(++j);
            System.out.print(arr[i]+" ");
        }
    }    
}
 