import java.util.Scanner;

// 1      1
// 12    21
// 123  321
// 12344321

public class Pattern26 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i; k <= n - 1; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
