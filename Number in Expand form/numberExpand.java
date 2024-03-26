
public class numberExpand {
    public static void main(String[] args) {
        int num=70304;
        String str=""+num;
        String output="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!='0'){
                output+=str.charAt(i);
                for(int j=i+1; j<str.length(); j++){
                    output+="0";
                }
                if(i!=str.length()-1) output+="+";
            }
        }
        System.out.println(output);
    }
}
