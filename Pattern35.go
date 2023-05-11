package main

import "fmt"

func main() {
	var n int
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n)
	for i := 1; i <= n; i++ {
		for k := n; k >= i; k-- {
			fmt.Print(" ")
		}
		for j := 1; j <= n; j++ {
			if i == 1 || i == n {
				fmt.Print("*")
			} else if j == 1 || j == n {
				fmt.Print("*")
			} else {
				fmt.Print(" ")
			}
		}
		fmt.Println()
	}

}
