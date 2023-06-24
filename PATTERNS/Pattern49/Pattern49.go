package main

import "fmt"

func main() {
	var n int
	num := 1
	fmt.Printf("Enter the row number:")
	fmt.Scanln(&n)
	for i := 1; i <= n; i++ {
		for k := i; k <= n; k++ {
			fmt.Printf("  ")
		}
		for j := 1; j <= i; j++ {
			num += 1
			for !primeNum(num) {
				num += 1
			}
			fmt.Printf(" %d ", num)
		}
		fmt.Printf("\n")
	}
}

func primeNum(val int) bool {
	num := 2
	if val < num {
		return false
	}
	for num*num <= val {
		if val%num == 0 {
			return false
		}
		num += 1
	}
	return true
}
