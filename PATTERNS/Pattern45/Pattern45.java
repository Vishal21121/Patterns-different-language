import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner z= new Scanner(System.in);
System.out.println("Enter the Number of rows: ");
int rows = z.nextInt(); // Number of rows in the rhombus
    for (int i = 1; i <= rows; i++) {
        // Print spaces
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        // Print stars for left diagonal
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }

        // Print stars for right diagonal
        for (int k = i - 1; k >= 1; k--) {
            System.out.print("*");
        }

        System.out.println(); // Move to the next line
    }

    for (int i = rows - 1; i >= 1; i--) {
        // Print spaces
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        // Print stars for left diagonal
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }

        // Print stars for right diagonal
        for (int k = i - 1; k >= 1; k--) {
            System.out.print("*");
        }

        System.out.println(); // Move to the next line
    }
}
}
