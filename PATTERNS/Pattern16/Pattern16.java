import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            int k=n-i+1;
            for(int j=0;j<2*k-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
