package main

import "fmt"

func main() {
	var n int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i := 1; i <= n; i++ {
		for j := 1; j <= n; j++ {
			if i%2 != 0 {
				if j%2 != 0 {
					fmt.Print(1)
				} else {
					fmt.Print(0)
				}
			} else {
				if j%2 != 0 {
					fmt.Print(0)
				} else {
					fmt.Print(1)
				}
			}
		}
		fmt.Println()
	}
}
