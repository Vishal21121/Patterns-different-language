import java.util.Scanner;
public class Pattern41 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] cont = new String[n-1];

        for(int i = 0; i < n; i++) {
            StringBuilder tempstr = new StringBuilder();
            tempstr.append(" ".repeat(i));
            for(int j = i+1; j < n+1; j++) {
                tempstr.append(j).append(" ");
            }
            if (!(i == n - 1)) cont[i] = tempstr.toString();
            System.out.println(tempstr);
        }
        for(int i = n-2; i >= 0; i--) {
            System.out.println(cont[i]);
        }
    }
}
