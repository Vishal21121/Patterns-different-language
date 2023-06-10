// *       *
// *     *
// *   *
// * *
// *
// * *
// *   *
// *     *
// *       *

package main

import "fmt"

func main() {
	var n int = 0
	fmt.Println("Enter the number of rows:")
	fmt.Scanf("%d", &n)
	var flag int
	for i := 1; i <= 2*n-1; i++ {
		if i <= n {
			flag = i
		} else {
			flag = 2*n - i
		}
		var flag1 int = n
		for k := flag1; k >= 1; k-- {
			fmt.Printf(" ")
		}
		for j := flag1; j >= flag; j-- {
			if j == flag1 || j == flag {
				fmt.Printf("* ")
			} else {
				fmt.Printf("  ")
			}

		}
		fmt.Printf("\n")
	}
}
