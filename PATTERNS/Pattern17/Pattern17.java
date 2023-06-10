    //     *
    //    * *
    //   *   *
    //  *     *
    // *********

import java.util.Scanner;
public class Pattern17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            int col = i<n ? i : 2*n-1;
            for(int j=1;j<=col;j++){
                if(col<2*n-1){
                    if(j==1 || j==i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                else{
                    System.out.print("*");
                }
        
            }
            System.out.print("\n");
        }
    }
}