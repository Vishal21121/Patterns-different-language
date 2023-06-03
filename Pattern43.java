import java.util.Scanner;

public class Pattern43 {

   
public static void printUseBinomialExpansion(int n) {
    for (int line = 1; line <= n; line++) {
        for (int j = 0; j <= n - line; j++) {
            System.out.print(" ");
        }

        int k = 1;
        for (int i = 1; i <= line; i++) {
            System.out.print(k + " ");
            k = k * (line - i) / i;
        }

        System.out.println();
    }
}
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("Enter : );
       int n = scanner.nextInt();
        printUseBinomialExpansion(n);


        
    }

   
}
