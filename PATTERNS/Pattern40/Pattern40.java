import java.util.Scanner;

public class Pattern40 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if (col%2==0) System.out.print((row+1)%2);
                else System.out.print(row%2);
            }
            System.out.println();
        }
    }
}
