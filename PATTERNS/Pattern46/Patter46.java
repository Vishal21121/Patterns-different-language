import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int rows = z.nextInt(); // Number of rows in the butterfly pattern
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
