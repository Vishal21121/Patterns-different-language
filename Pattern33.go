package main

import "fmt"

func main() {
	var n int
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n)
	var flag int = 1
	for i := 1; i <= 2*n-1; i++ {
		if i == n {
			flag = 2*n - 1
		}
		for k := 1; k <= n-flag; k++ {
			fmt.Printf(" ")
		}
		for j := 1; j <= flag; j++ {
			fmt.Printf("+")
		}
		flag = 1
		fmt.Println()
	}
}
