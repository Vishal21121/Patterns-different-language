import java.util.Scanner;

public class Pattern47 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}
