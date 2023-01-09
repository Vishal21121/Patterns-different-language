import java.util.Scanner;

// E
// D E
// C D E
// B C D E
// A B C D E

public class Pattern28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = n - i;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", (char) (64 + val + j));
            }
            System.out.printf("\n");
        }
    }
}