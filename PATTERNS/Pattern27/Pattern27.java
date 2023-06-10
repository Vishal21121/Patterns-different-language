import java.util.Scanner;

// 4 4 4 4 4 4 4  
// 4 3 3 3 3 3 4   
// 4 3 2 2 2 3 4   
// 4 3 2 1 2 3 4   
// 4 3 2 2 2 3 4   
// 4 3 3 3 3 3 4   
// 4 4 4 4 4 4 4 

public class Pattern27 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = in.nextInt();
        for (int i = 0; i <2*n-1;i++) {
            for(int j=0;j<2*n-1;j++){
                int val = n-(Math.min(Math.min(j,2*(n-1)-j),Math.min(i,2*(n-1)-i)));
                System.out.print(val+ " ");
            }
            System.out.println();
        }
    }
}