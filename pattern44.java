import java.util.Scanner;

public class pattern44 {
    public static void printPattern(int n) {
        // Print top line
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.print(" ");
                continue;
            }
            System.out.print("*");
        }
        System.out.println();

        // Print middle lines
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Print bottom line
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.print(" ");
                continue;
            }
            System.out.print("*");
        }
        System.out.println();

        // Print additional lines
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Print final line
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.print(" ");
                continue;
            }
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = scanner.nextInt();

        printPattern(n);
    }
}
