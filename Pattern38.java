package pattern38;
import java.util.Scanner;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix");
		int n=sc.nextInt();
		n*=2;
		//Initialize the matrix
		char[][] pattern= new char[n][n];
		for (int i=0; i<n ; i++) {
			for (int j=0 ; j<n ; j++) {
				pattern[i][j]=' ';
			}
		}
		//Create the pattern
		for (int i=0; i<n ; i++) {
			pattern[i][0]='*';
			pattern[i][n-1]='*';
		}
		
		int pos=1;
	
		while(pos<n-1){
			pattern[pos][pos]='*';
			pattern[pos][n-(pos+1)]='*';
			pos++;
		}
		//print the solution
		for (int i=0; i<n ; i++) {
			for (int j=0 ; j<n ; j++) {
				System.out.print(pattern[i][j]+" ");
			}
			System.out.println();  
		}
		sc.close();		
	}
}
