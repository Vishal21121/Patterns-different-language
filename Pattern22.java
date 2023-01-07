// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

import java.util.Scanner;
public class Pattern22{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n = in.nextInt();
        for (int i = 1; i <= (2 * n - 1); i++)
    {
        int k = (i <= n) ? i : (2 * n - i);
        int spaceChange = i <= n ? n - i + 1 : (i - n) + 1;
        for (int j = 1; j <= k; j++)
        {
            System.out.print("*");
        }
        for (int space = 1; space < spaceChange; space++)
        {
            System.out.print("  ");
        }
        for (int j = k; j >= 1; j--)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    }
}