// 1 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3
// 4 4 4
// 5 5
// 6

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}