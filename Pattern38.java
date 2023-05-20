/**
 * Pattern38
 */
public class Pattern38 {

    public static void main(String[] args) {
        Pattern(5);
    }

    // Pattern38 constructor
    public static void Pattern(int n) {
        n = n * 2;
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {
                if (row == col || col + row == n + 1 || col == 1 || col == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();

        }
    }
}