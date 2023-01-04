// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

package main

import "fmt"

func main() {
	k := 1
	var n int
	fmt.Println("Enter the row number:")
	fmt.Scanf("%d",&n)
	var spaceChange int
	for i := 1; i <= (2 * n - 1); i++ {
		if i <= n {
			k = i
			spaceChange = n - i + 1
		} else {
			k = 2 * n - i
			spaceChange = (i - n) + 1
		}
		for j := 1; j <= k; j++ {
			fmt.Print("*")
		}
		for space := 1; space < spaceChange; space++ {
			fmt.Print("  ")
		}
		for j := k; j >= 1; j-- {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
