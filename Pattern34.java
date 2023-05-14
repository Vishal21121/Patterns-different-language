import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i < 2 * n; i++) {
            for (int k = 2 * n - 1; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else if (i == 2 * n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
        sc.close();
    }
}