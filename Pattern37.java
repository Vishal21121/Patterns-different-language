import java.util.Scanner;

/*Pattern Program 1 in Java

    *****
   ****
  ***
 **
*
 **
  ***
   ****
    *****

*/
public class Pattern37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for n");
        int n = scan.nextInt();
        scan.close();
        pattern(n);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }

            for (int i = row; i <= n; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int row = 2; row <= n; row++) {
            for (int i = 0; i < row - 1; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= row; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
