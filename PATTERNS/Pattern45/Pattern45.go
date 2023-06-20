package main

import "fmt"

func main() {
	var n int
	var Corep int
	var spaceChange int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d",&n)
	for row:= 1; row <= 2*n-1; row++{
		if row<=n{
			if row > 1{
				Corep = 2*row-1
			}else{
				Corep = row
			}
		}else{
			Corep = 2*(2*n-row)-1
		}
		if row <= n{
			spaceChange = n-row+1
		}else{
			spaceChange = (row-n)+1
		}
		for space:= 1; space <= spaceChange; space++{
			fmt.Print(" ")
		}
		for col:= 1; col <= Corep; col++{
			fmt.Print("*");
		}
		fmt.Println()
	}
}
