package main

import "fmt"

func main() {

	var n int
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n)
	var flag int

	for i := 1; i <= 2*n-1; i++ {
		if i <= n {
			flag = i
		} else {
			flag = 2*n - i
		}
		var flag1 int = n
		for k := 1; k <= flag; k++ {
			fmt.Printf(" ")
		}
		for j := flag; j <= flag1; j++ {
			fmt.Printf("%d ",j)
		}
		fmt.Printf("\n")
	}
}
