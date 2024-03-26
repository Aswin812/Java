import java.util.Arrays;

public class maxmin {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 1, 9, 5, 8, 2, 7 };
        Arrays.sort(arr);
        int[] output = new int[arr.length];
        int min = 0, max = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                output[i] = arr[max--];
            else
                output[i] = arr[min++];
        }
        System.out.println(Arrays.toString(output));
    }
}
