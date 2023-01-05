import java.util.*;

public class Pattern23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            for(int j=0;j<=n/2-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i-2;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=n/2-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n/2;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*(n/2-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
