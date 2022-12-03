import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the row number:");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
               System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}