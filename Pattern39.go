package main

import "fmt"

func main() {
	var n int
	var col int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i := 1; i <= n+(n-3); i++ {
		for k := i; k <= n; k++ {
			fmt.Print(" ")
		}
		if i < n {
			col = i
		} else {
			col = n
		}
		for j := 1; j <= col; j++ {
			if col < n {
				if j == 1 || j == i {
					fmt.Print("* ")
				} else {
					fmt.Print("  ")
				}
			} else if i == n && j <= col {
				fmt.Print("* ")
			} else {
				if j == 1 || j == col {
					fmt.Print(" *")
				} else {
					fmt.Print("  ")
				}
			}

		}
		fmt.Println()
	}
}
