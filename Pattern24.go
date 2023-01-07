// ****
// *  *
// *  *
// *  *
// ****

package main

import "fmt"

func main() {
	var n int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d",&n)
	for i:=1;i<=n;i++{
		for j:=1;j<=n-1;j++{
			if (i==1 || i==n){
				fmt.Print("*")
			}else{
				if (j==1 || j==n-1){
					fmt.Print("*")
				}else{
					fmt.Print(" ")
				}
			}
		}
		fmt.Println()
	}
}