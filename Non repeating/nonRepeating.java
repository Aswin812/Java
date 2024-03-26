
public class nonRepeating {
    public static void main(String[] args) {
        String input="streSS";
        String s=input.toLowerCase();
        String result="";
        int count=0;
        for(int i=0; i<s.length(); i++){
            count=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(input.charAt(i));
                break;
            }
        }
        if(count!=1) System.out.println("All Characters are repeating");
    }    
}
//   char temp1=s.charAt(i);
//   char temp2=s.charAt(j);
//   if(temp1>=65 && temp1<=90){
//     temp1+=32;
//   }
//   if(temp2>=65 && temp2<=90){
//     temp2+=32;
//   }
    //     public static String firstNonRepeatingLetter(String s){
    //       String result="";
    //       for(int i=0; i<s.length(); i++){
    //         int count=0;
    //         for(int j=0; j<s.length(); j++){
    //           char temp1=s.charAt(i);
    //           char temp2=s.charAt(j);
    //           if(temp1>=65 && temp1<=90){
    //             temp1+=32;
    //           }
    //           if(temp2>=65 && temp2<=90){
    //             temp2+=32;
    //           }
    //            if(temp1==temp2){
    //              count++;
    //            }
    //         }
    //         if(count==1){
    //           result+=s.charAt(i);
    //   //         j=s.length();
    //           i=s.length();
    //         }
    //       }
    //       return result;
    //     }
    //   }
    
