import java.util.Scanner;

/**
 * Pattern25
 */
public class Pattern25 {

    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                
                System.out.print(j%2);

            }
            System.out.println();

        }
    }
}