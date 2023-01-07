import java.util.Scanner;

// ****
// *  *
// *  *
// *  *
// ****

public class Pattern24 {
    public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of rows:");
    n = in.nextInt();
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - 1; j++)
        {
            if (i == 1 || i == n)
            {
                System.out.print("*");
            }
            else
            {
                if (j == 1 || j == n - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
        System.out.print("\n");
    }
    }
}
