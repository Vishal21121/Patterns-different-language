import java.util.Scanner;
public class Pattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
	        for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i == 1 || i == n){
                for(int j=1;j<=n;j++){
                    System.out.print('*');
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j ==1 || j==n){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
