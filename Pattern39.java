public class Pattern39 {
    static void aPattern(int a){
         int n = a + 2; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print spaces
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*"); // Print stars at the beginning and end
                } else if (i == (n + 1) / 2) {
                    System.out.print("*"); // Print stars in the middle row
                } else {
                    System.out.print(" "); // Print spaces in other positions
                }
            }

            System.out.println(); // Move to the next line
        }
    }
    public static void main(String[] args) {
        aPattern(9);
       
    }
}
