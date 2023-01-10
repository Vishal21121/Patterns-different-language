import java.util.Scanner;

// a
// B c
// D e F
// g H i J
// k L m N o

public class Pattern29 {
    public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number:");
    n = in.nextInt();
    int val = 97;
    int flag = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if (flag == 0)
            {
                System.out.printf("%c ", (char)(val));
                flag = 1;
            }
            else
            {
                val = val - 32;
                System.out.printf("%c ", (char)(val));
                flag = 0;
                val+=32;
            }
            val += 1;
        }
        System.out.print("\n");
    }
    }
}
