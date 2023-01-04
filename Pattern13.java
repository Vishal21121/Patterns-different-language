import java.util.Scanner;

public class Pattern13 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 2 * (n - i); j >= 0; j--) {

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}