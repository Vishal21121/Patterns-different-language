//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1
import java.util.Scanner;
public class Pattern21{
    public static void main(String[] args) {
    int n;
	int colCount;
	Scanner in  = new Scanner(System.in);
	System.out.print("Enter the row number:");
    n = in.nextInt();
	for (int row= 1; row <= 2*n - 1; row++){
		if (row<=n){
			colCount = row;
		}else{
			colCount = 2 * n - row;
		}
		int spaceCount = n-colCount+1;
		for (int k=1;k<=spaceCount;k++){
			System.out.print(" ");
		}
		for(int col=colCount;col>=1;col--){
			System.out.print(col);
		}
		for (int col=2;col<=colCount;col++){
			System.out.print(col);
		}
		System.out.print("\n");
	}
    }
}