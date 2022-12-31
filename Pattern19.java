import java.util.Scanner;

//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int Corep;
        int spaceChange;
        for (int row = 1; row <= 2 * n - 1; row++)
    {
        Corep = row <= n ? row : 2 * n - row;
        spaceChange = row <= n ? n - row + 1 : (row - n) + 1;
        for (int k = 1; k <= spaceChange; k++)
        {
            System.out.print(" ");
        }
        for (int col = 1; col <= Corep; col++)
        {
            if (col == 1 || col == Corep)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
}