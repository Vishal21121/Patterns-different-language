// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F

package main

import "fmt"

func main() {
	var n int
	val := 64
	fmt.Printf("Enter the number:")
	fmt.Scanf("%d", &n)
	for i := 1; i <= n; i++ {
		for j := 1; j <= i; j++ {
			fmt.Printf("%c ", val+j)
		}
		fmt.Printf("\n")
	}
}
