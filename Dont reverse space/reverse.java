
public class reverse {
    public static void main(String[] args) {
        String input="1 22 333 4444 55555";
        StringBuffer str=new StringBuffer(input);
        int n=str.length()-1;
        for(int i=0; i<n; i++,n--){
            if (str.charAt(i)!=' ') {
                if (str.charAt(n)!=' ') {
                    char temp = str.charAt(i);
                    char t2=str.charAt(n);
                    str.deleteCharAt(n);
                    str.deleteCharAt(i);
                    str.insert(i, t2);
                    str.insert(n, temp);
                } else
                    i--;
            } else
                n++;
                if (n==n/2) break;
        }
        System.out.println(str);

    }
}
