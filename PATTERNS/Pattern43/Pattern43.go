package main
import "fmt"

// generateCoefficients generates the coefficients of Pascal's Triangle up to numRows.
func generateCoefficients(numRows int) [][]int {
	coefficients := make([][]int, numRows)

	for i := 0; i < numRows; i++ {
		coefficients[i] = make([]int, i+1)
		coefficients[i][0] = 1

		for j := 1; j < i; j++ {
			// Calculate the coefficient by summing up the corresponding values from the previous row.
			coefficients[i][j] = coefficients[i-1][j-1] + coefficients[i-1][j]
    }
		coefficients[i][i] = 1
	}
	return coefficients
}

func main() {
	var numRows int
	fmt.Print("Enter the number of rows: ")
	fmt.Scanln(&numRows)

	coefficients := generateCoefficients(numRows)

	for i := 0; i < numRows; i++ {
		for j := 0; j < numRows-i-1; j++ {
			fmt.Print("  ")
		}

		for j := 0; j <= i; j++ {
			fmt.Printf("%4d", coefficients[i][j])
		}

		fmt.Println()
	}
}
