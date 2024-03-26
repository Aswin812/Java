import java.util.ArrayList;

public class concordance {
    public static void main(String[] args) {
        StringBuilder input=new StringBuilder("hellojava");
        ArrayList<Integer> li=new ArrayList<>();
        int j=0;
        for(int i=0; i<input.length(); i++){
            for( j=i; j<input.length(); j++){
                if(input.charAt(i)==input.charAt(j)){
                    li.add(j);
                    if(i!=j)input.deleteCharAt(j);
                }
            }
            System.out.print(input.charAt(i)+"="+li +" ");
            li.clear();
        }
    }    
}
