//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1

package main

import "fmt"

func main() {
	var n int
	var colCount int
	fmt.Println("Enter the row number:")
	fmt.Scanf("%d",&n)
	for row:= 1; row <= 2*n - 1; row++ {
		if row<=n{
			colCount = row
		}else{
			colCount = 2 * n - row
		}
		spaceCount := n-colCount+1
		for k:=1;k<=spaceCount;k++{
			fmt.Print(" ")
		}
		for col:=colCount;col>=1;col--{
			fmt.Print(col)
		}
		for col:=2;col<=colCount;col++{
			fmt.Print(col)
		}
		fmt.Println()
	}

}