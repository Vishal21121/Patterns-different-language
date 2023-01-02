import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
    System.out.println("enter n:");
    Scanner inp = new Scanner(System.in);
    int n =inp.nextInt();
        for (int i = 1; i <= n; i++) {
            
            for (int j = i; j <= n; j++) {
                System.out.print("*");
              }
               System.out.println("");
            
        }
    }
}