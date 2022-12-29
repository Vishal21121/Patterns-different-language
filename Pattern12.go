package main

import "fmt"

func main() {
	var n int
	fmt.Println("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i := 1; i <= n; i++ {
		for j := i; j <= n; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
