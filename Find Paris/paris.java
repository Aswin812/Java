public class paris {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 7 };
        int[] b = { 5, 6, 3, 4, 8 };
        int n = 9;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == n) {
                    System.out.println(a[i] + " " + b[j]);
                }
            }
        }
    }
}

// 1. Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG fashion as shown in figure.
 
// Example:
// Input: 
// 1 2 3
// 4 5 6
// 7 8 9
// Output: 
// 1 2 4 7 5 3 6 8 9
