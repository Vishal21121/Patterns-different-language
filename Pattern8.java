import java.util.Scanner;

// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row number:");
        int n = in.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++count +" ");
            }
            System.out.println();
        }
    }
}