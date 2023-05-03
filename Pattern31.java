
/*
 *       * 
  *     *  
   *   *   
    * *
     *   
    * *    
   *   *   
  *     *  
 *       * 
 
 */
import java.util.*;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int n = input.nextInt();

        for (int i = 1; i < 2 * n; i++) {
            int flag, flag1 = n;
            if (i <= n) {
                flag = i;
            } else {
                flag = 2 * n - i;
            }
            for (int k = 1; k <= flag; k++) {
                System.out.print(" ");
            }
            for (int j = flag1; j >= flag; j--) {
                if (j == flag1 || j == flag) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}