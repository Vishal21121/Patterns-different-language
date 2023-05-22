import java.util.Scanner;

public class Pattern39 {
    static void aPattern(int n) {
        for (int i = 1; i <= n+2; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println("*");
            } else if (i == n) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }else if (i > n) {
                for (int k = 1; k <= 2*n-3 ; k++) {
                    if(k ==1 || k == 2*n-3){
                        System.out.print("*");
                        System.out.print(" ");


                    }
                    System.out.print(" ");


                }
                System.out.println();
            }
            else {
                System.out.print("*");
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        aPattern(n);
    }
}
