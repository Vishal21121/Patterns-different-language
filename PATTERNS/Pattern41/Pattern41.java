import java.util.Scanner;

public class Pattern41 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++){
                System.out.print(j);
                System.out.print(" ");
            }

           System.out.println();  

           if(i == n)
                break;

           for(int k=1; k<=i; k++)
                System.out.print(" ");
        }
        
        for(int i=1; i<=n-2; i++)
            System.out.print(" ");

        for(int i=1; i<n; i++) {
            for(int j=n-i; j<=n; j++){
                System.out.print(j);
                System.out.print(" ");
            }

           System.out.println(); 
            
           for(int k=1; k<n-i-1; k++)
                System.out.print(" ");
        }
    }
}