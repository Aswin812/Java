import java.util.Arrays;

public class anagramTogether {
    public static void main(String[] args) {
        String[] input = { "cat", "dog", "tac", "god", "act" };
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + " ");
            String[] temp1 = input[i].split("");
            Arrays.sort(temp1);
            if (input[i] != "") {
                for (int j = i + 1; j < input.length; j++) {
                    int count = 0;
                    String[] temp2 = input[j].split("");
                    Arrays.sort(temp2);
                    for (int x = 0; x < temp1.length; x++) {
                        if (temp1[x].equals(temp2[x])) {
                            count++;
                        } else
                            break;
                    }
                    if (count == temp1.length) {
                        System.out.print(input[j] + " ");
                        input[j] = "";
                    }
                }
            }
        }
    }
}
