import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input n where row = 2*n - 1: ");
        int n = scanner.nextInt();
        int flag = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i == n) {
                flag = 2 * n - 1;
            }
            for (int k = 1; k <= n - flag; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= flag; j++) {
                System.out.print("+");
            }
            flag = 1;
            System.out.println();
        }
    }
}
