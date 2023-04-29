public class Main
{
    //final int rows = args[1],cols = args[2] ;
    private static final int rows = 9, cols = 9 ;
	public static void main(String[] args) {
	    
	    String[][] matrix = new String[rows][cols] ;
        int i = 0 , z = 0 , j = 0 ;
        
        for(i = 0 ; i < rows ; i++){
            z = cols - i - 1 ;
            matrix[i][i] = "*" ;
	        matrix[i][z] = "*" ;
            matrix = fillWithSpaces(matrix, j, i , z) ;
                
            }
            printMatrix(matrix) ;
        }
    
        
	public static String[][] fillWithSpaces(String matrix[][],int j, int i, int z){
	    for(j = 0; j < cols ; j++){
            if(j == i || j == z)continue ;
                matrix[i][j] = " " ;  
	    }
	    return matrix ;
	}
	
	public static void printMatrix(String[][]matrix){
	    int i = 0, j = 0 ;
	    for(i = 0 ; i < rows ; i++){
            for(j = 0 ; j < cols ; j++){
                System.out.print(matrix[i][j]) ;
            }
             System.out.print("\n") ;
        }
	}
}
