package main

import "fmt"

func main() {
	var n int
	var limit int
	fmt.Println("Enter the row number:")
	fmt.Scanf("%d",&n)
	for row:= 1; row <= 2*n-1; row++{
		if row<=n{
			limit = n-row+1
		}else{
			limit = (row-n)+1
		}
		for space:= 1; space <= limit; space++{
			fmt.Print(" ")
		}
		for col:= 1; col <= limit; col++{
			fmt.Print("*");
		}
		fmt.Println()
	}
}
