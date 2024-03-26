
public class reverse {
    public static void main(String[] args) {
        String input = "house!no:12";
        String[] arr = input.split("");
        int n = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++, n--) {
            if (Character.isLetter(input.charAt(i)) || Character.isDigit(input.charAt(i))) {
                if (Character.isLetter(input.charAt(n)) || Character.isDigit(input.charAt(n))) {
                    String temp = arr[i];
                    arr[i] = arr[n];
                    arr[n] = temp;
                } else
                    i--;
            } else
                n++;
        }
        String output = "";
        for (String i : arr) {
            output += i;
        }
        System.out.println(output);

    }
}
