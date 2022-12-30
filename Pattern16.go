    // *********
    //  *******
    //   *****
    //    ***
    //     *

package main

import "fmt"

func main(){
	var n int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i := 1; i <= n; i++ {
		for k := 1; k <= i; k++ {
			fmt.Print(" ")
		}
		for j := 1; j <= 2*(n-i)+1; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}