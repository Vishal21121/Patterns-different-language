package main

import "fmt"

func main() {
	var n int
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n)
	for i := 1; i <= 2*n-1; i++ {
		for k := 2*n - 1; k >= i; k-- {
			fmt.Print("  ")
		}
		for j := 1; j <= i; j++ {
			if j == 1 || j == i {
				fmt.Print("* ")
			} else if i == 2*n-1 {
				fmt.Print("* ")
			} else {
				fmt.Print("  ")
			}
		}
		fmt.Println()
	}

}
