package main

import "fmt"

func main() {
	var rows int
	fmt.Print("Enter the number of rows: ")
	fmt.Scan(&rows) // Number of rows in the butterfly pattern

	// Print the upper half of the butterfly pattern
	for i := 1; i <= rows; i++ {
		// Print numbers in increasing order
		for j := 1; j <= i; j++ {
			fmt.Printf("%d ", j)
		}

		// Print spaces
		for j := 1; j <= 2*(rows-i); j++ {
			fmt.Print("  ")
		}

		// Print numbers in decreasing order
		for j := i; j >= 1; j-- {
			fmt.Printf("%d ", j)
		}

		fmt.Println()
	}

	// Print the lower half of the butterfly pattern
	for i := 1; i <= rows; i++ {
		// Print spaces
		for j := 1; j <= i; j++ {
			fmt.Print("  ")
		}

		// Print numbers in decreasing order
		for j := rows; j >= i; j-- {
			fmt.Printf("%d ", j)
		}

		// Print numbers in decreasing order
		for j := rows - i; j >= 1; j-- {
			fmt.Printf("%d ", j)
		}

		fmt.Println()
	}
}
