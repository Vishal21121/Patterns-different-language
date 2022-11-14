//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

import java.util.Scanner;
public class Pattern_12 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int n = in.nextInt();

        for(int i=1;i<=2*n;i++){
            int flag = i<=n?i:2*n-i+1;
            int flag1 = n;
            for(int k =1;k<=flag;k++){
                System.out.print(" ");
            }
            for(int j=flag1;j>=flag;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
