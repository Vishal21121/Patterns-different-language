package main

import "fmt"

func main() {

	var n int
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n)
	var flag int
	var flag1 int
	var initialLetter int = 'A' - 1
	for i := 1; i <= 2*n; i++ {
		if i <= n {
			flag = 1
			flag1 = n - i + 1
		} else {
			flag = 1
			flag1 = i-n
		}
		for j := flag; j <= flag1; j++ {
			fmt.Printf("%c ", initialLetter+j)
		}
		fmt.Printf("\n")
	}
}
