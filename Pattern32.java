import java.util.Scanner;

public class Pattern32{

    public static void main(String[] args){

        System.out.println("Enter the input n where row = 2*n-1");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       

        for (int i = 1; i <= (2 * n - 1); i++) {
            int flag;
            if (i <= n) {
                flag = i;
            } else {
                flag = 2 * n - i;
            }
            int flag1 = n;
            for (int k = flag1; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = flag1; j >= flag; j--) {
                if (j == flag1 || j ==flag) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}