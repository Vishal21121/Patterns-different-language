import java.util.Scanner;

// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F
 
public class Pattern10 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = in.nextInt();
        int val = 64;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print((char)(val+j)+" ");
            }
            System.out.println();
        }
    }
}
