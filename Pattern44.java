import java.util.Scanner;
public class Pattern44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value for n: ");
        int n = s.nextInt();
        int k = n * 2 - 1;

        for (int i = 1; i <= k; i++) {
            if (i == 1 || i == n || i == k) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } 
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}