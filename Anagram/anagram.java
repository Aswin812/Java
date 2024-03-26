
public class anagram {
    public static void main(String[] args) {
        String inp1="Aswin";
        String inp2="Niwsa";
        String str1=inp1.toLowerCase();
        String str2=inp2.toLowerCase();
        int count=0;
        if(str1.length()==str2.length()){
            for(int i=0; i<str1.length(); i++){
                for(int j=0; j<str2.length(); j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        count++;
                        j=str2.length();
                    }
                }
            }
        }
        
        if(count==str1.length())System.out.println(inp1+" is a Anagram");
        else System.out.println(inp1+" is not a Anagram");
    }    
}
