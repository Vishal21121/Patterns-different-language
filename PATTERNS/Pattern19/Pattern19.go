    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *

	package main

import "fmt"

func main() {
	var n int
	var Corep int
	var spaceChange int
	fmt.Println("Enter the row number:")
	fmt.Scanf("%d",&n)
	for row:= 1; row <= 2*n-1; row++{
		if row<=n{
			Corep = row
		}else{
			Corep = 2*n-row
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
			if(col==1 || col == Corep){
				fmt.Print("* ")
			}else{
				fmt.Print("  ")
			}
		}
		fmt.Println()
	}
}