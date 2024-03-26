
public class vowel {
    public static void main(String[] args) {
        String input = "cOmpuuiiioooter";
        String s=input.toLowerCase();
        System.out.println("Input : "+s);
        String output = "";
        char[] arr = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (s.charAt(i) != arr[j]) {
                    count++;
                } 
                if (s.charAt(i) == arr[j] && s.charAt(i + 1) == arr[j] || s.charAt(i-1)==arr[j]) {
                    count++;
                }
            }
            if (count >= arr.length) {
                output += s.charAt(i);
            }
        }
        System.out.println("Output : "+output);

    }
}
