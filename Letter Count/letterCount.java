public class letterCount {
    public static void main(String[] args) {
        String input="aaaabbbcc";
        int count=1;
        String output="";
        for(int i=0; i<input.length(); i++){
            char temp=input.charAt(i);
            for(int j=1; j<input.length(); j++){
                if(temp==input.charAt(j)){
                    count++;
                }
            }
            i+=count-1;
            output+=temp;
            output+=count;
            count=0;
        }
        System.out.println(output);
    }
}
