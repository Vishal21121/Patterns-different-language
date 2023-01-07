import java.util.Scanner;

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

public class Pattern23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows:");
        n = in.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            int spaceCount = i <= n ? i : 2 * n - i + 1;
            int colCount = i <= n ? n : 2 * i - n - 1;
            for (int j = i; j <= colCount; j++) {
                System.out.print("*");
            }
            for (int col = 2; col <= spaceCount; col++) {
                System.out.print("  ");
            }
            for (int j = i; j <= colCount; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}