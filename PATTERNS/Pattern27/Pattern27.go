// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Printf("Enter the number:")
	fmt.Scanf("%d", &n)
	for i := 0; i < 2*n-1; i++ {
		for j := 0; j < 2*n-1; j++ {
			val := n-int((math.Min(float64(math.Min(float64(j),float64(2*(n-1)-j))),float64(math.Min(float64(i),float64(2*(n-1)-i))))))
			fmt.Printf("%d ", val)
		}
		fmt.Printf("\n")
	}
}
