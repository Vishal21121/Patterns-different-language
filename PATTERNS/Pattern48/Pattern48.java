import java.util.Scanner;

public class Pattern48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        printPattern(rows);

    }

    static void printPattern(int n) 
    { 
        int col, num = 0; 
 
        // loop for row
        for (int row = 1; row <= n; row++) { 
 
            // when row number is odd,then print in increasing order.
            if (row % 2 != 0) { 
 
                // printing in ascending order
                for (col = num + 1; col < num + row; col++) 
                    System.out.print(col + " "); 
                System.out.println(col++); 
 
                // update value of 'num' 
                num = col; 
            } 
 
         // when row number is odd,then print in descending order.
            else { 
 
                // update value of 'num' 
                num = num + row - 1; 
 
                // print numbers with the ' ' in 
                // decreasing order 
                for (col = num; col > num - row + 1; col--) 
                    System.out.print(col + " "); 
                System.out.println(col); 
            } 
        } 
    }
}