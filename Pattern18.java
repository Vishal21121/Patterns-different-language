// *********
//  *     *
//   *   *
//    * *
//     *

import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            int col = i == 1 ? 2 * n - 1 : n;
            for (int j = i; j <= col; j++) {
                if (col < 2 * n - 1) {
                    if (j == i || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
