public class butterflyPattern {
    public static void main(String[] args) {
        int n = 6;
        int x = 1;
        int y = n*2;
        for (int i = 1; i <= n*2; i++, x++, y--) {
            for (int j = 1; j <= n*2; j++) {
                if (j <= x || j >= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i >= (n*2) / 2) {
                x -= 2;
                y += 2;
            }
            System.out.println("");
        }
    }
}
