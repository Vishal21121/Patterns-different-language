import java.util.Scanner;

public class Pattern42{
    static void aPattern(int n) {
        for (int i = 0; i <= 2*n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)('A' + j));
                System.out.print(" ");
            }
          if(i>n){
            for (int j = 0; j < i - n; j++) {
                System.out.print((char)('A' + j));
                System.out.print(" ");
            }
          }
          if(i!=n){
            System.out.println();
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
