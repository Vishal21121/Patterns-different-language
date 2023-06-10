import java.util.Scanner;

// E D C B A
// D C B A
// C B A
// B A
// A

public class Pattern30{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n = in.nextInt();
        int val = 64+n;
        for(int i=1;i<=n;i++){
            int printable = val;
            for(int j=i;j<=n;j++){
                System.out.printf("%c ",(char)(printable--));
            }
            val--;
            System.out.println();
        }
    }
}