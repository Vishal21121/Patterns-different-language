package main

import "fmt"

func main() {
	var n int
	num := 2
	fmt.Printf("Enter the number:")
	fmt.Scanf("%d", &n)

	for i := 1; i < 2*n; i++ {
		if i == 1 || i == n || i == 2*n-1 {
			for j := 1; j <= n; j++ {
				fmt.Printf("%d ", num)
				num += 2
			}
		} else {
			fmt.Printf("%d", num)
			num += 2
		}
		fmt.Println()
	}
}
