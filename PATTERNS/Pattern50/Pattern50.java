import java.util.Scanner;

public class Pattern50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int num = 2;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i % (n - 1) == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(num + " ");
                    num += 2;
                }
                System.out.println();
            } else {
                System.out.println(num);
                num += 2;
            }
        }
    }
}