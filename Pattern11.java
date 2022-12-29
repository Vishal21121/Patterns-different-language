//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int n = in.nextInt();
        for (int row = 1; row <= 2*n-1; row++) {
            int Corep = row<=n ? row: 2*n-row;
            int spaceChange = row <= n ? n-row+1: (row-n)+1;
            for (int space = 1; space <= spaceChange; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= Corep; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
