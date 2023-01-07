import java.util.Scanner;

public class Pattern13 {
    public static void main(String args[]) {

        System.out.println("enter number:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = n-i; k >= 1; k--) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
