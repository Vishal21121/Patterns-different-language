import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern43 {

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n;
        try {
            n = input.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Enter an integer (> 0)");
        }

        checkHeight(n);
        String pyramid = getPyramid(n);

        System.out.println(pyramid);
    }

    private static void checkHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("The height of the pyramid must be greater than 0!");
        }
    }

    private static String getPyramid(int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            int coef = 1;
            sb.append(" ".repeat(height - i));
            for (int j = 0; j <= i; j++) {
                if (j != 0) {
                    coef = coef * (i - j + 1) / j;
                } else {
                    coef = 1;
                }
                sb.append(" ")
                        .append(coef);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
