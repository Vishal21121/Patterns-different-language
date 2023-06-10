    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int k = i;k<=n;k++){
                System.out.print("  ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j+ " ");
            }
            for(int p = 2;p<=i;p++){
                System.out.print(p+ " ");
            }
            System.out.println();
        }
    }
}
