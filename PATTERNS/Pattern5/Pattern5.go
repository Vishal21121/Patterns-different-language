// * * * * *
//  * * * *
//   * * *
//    * *
//     *

package main

import "fmt"

func main() {

	var n int;
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n);

	for i := 1; i <= n; i++ {
		for k := 1; k <= i; k++ {
			fmt.Printf(" ")
		}
		for j := i; j <= n; j++ {
			fmt.Printf("* ")
		}
		fmt.Printf("\n")
	}
}
