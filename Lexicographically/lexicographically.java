public class lexicographically {
    public static void main(String[] args) {
        String input="welcome java";
        int n=3;
        String first="",last="";
        for(int i=0; i<input.length(); i++){
            if(i<n) first+=input.charAt(i);
            else if(i>=input.length()-n) last+=input.charAt(i);
        }
        if(first.charAt(0)>last.charAt(0)){
            String temp=first;
            first=last;
            last=temp;
        }
        System.out.println(first+" "+last);
    }    
}
