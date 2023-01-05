// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

package main

import "fmt"

func main() {
	var n int
	var spaceCount int
	var colCount int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d",&n)
	for i:=1;i<=2*n;i++{
		if i<=n{
			spaceCount = i
			colCount = n
		}else{
			spaceCount = 2*n-i+1
			colCount = 2*i-n-1
		}
		for j:=i;j<=colCount;j++{
			fmt.Print("*")
		}
		for col:= 2; col <= spaceCount; col++ {
			fmt.Print("  ");
		}
		for j:=i;j<=colCount;j++{
			fmt.Print("*")
		}
		fmt.Println()
	}
}
