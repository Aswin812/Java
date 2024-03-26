
public class countVowel {
    public static void main(String[] args) {
        String input="aswin";
        char[] arr={'a','A','e','E','i','I','o','O','u','U'};
        int n=arr.length;
        int vowel=0;
        int consonant=0;
        int s=0;
        for(int i=0; i<input.length(); i++){
            for(int j=0; j<n; j++){
                if(input.charAt(i)==arr[j]){
                    vowel++;
                    j=n;
                }
            }
        }
        consonant=input.length()-vowel-s;
        System.out.println("Number of Vowel : "+vowel);
        System.out.println("Number of Consonant : "+consonant);
    }    
}
