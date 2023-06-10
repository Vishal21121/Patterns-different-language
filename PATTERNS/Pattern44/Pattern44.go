package main

import "fmt"

func main() {
	var n int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)
	for i := 1; i <= 2*n-1; i++ {
		if i == 1 || i == n || i == 2*n-1 {
			fmt.Printf(" ")
		}
		for j := 1; j <= n; j++ {
			if i == 1 || i == n || i == 2*n-1 {
				if j > 1 && j < n {
					fmt.Printf("*")
				}
			} else {
				if j == 1 || j == n {
					fmt.Printf("*")
				} else {
					fmt.Printf(" ")
				}
			}
		}
		fmt.Printf("\n")
	}
}
