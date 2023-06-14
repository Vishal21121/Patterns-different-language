package main
import "fmt"

func printPattern(n int) {
	// Multiply n by 2 to determine the size of the pattern
	n = n * 2
	for row := 1; row <= n; row++ {
		for col := 1; col <= n; col++ {
			// Check conditions to determine if a "*" or " " should be printed
			if row == col || col+row == n+1 || col == 1 || col == n {
				fmt.Print("*")
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println() // Move to the next line after printing each row
	}
}

func main() {
	var num int
	fmt.Print("Enter the number of times you want to execute: ")
	fmt.Scanln(&num)
	printPattern(num)
}
