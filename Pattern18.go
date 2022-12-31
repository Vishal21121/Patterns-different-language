// *********
//  *     *
//   *   *
//    * *
//     *

package main

import "fmt"

func main() {
	var n int
	var col int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i:=1;i<=n;i++{
		for k:=1;k<=i;k++{
			fmt.Print(" ")
		}
		if i==1{
			col = 2*n-1
		}else{
			col = n
		}
		for j:=i;j<=col;j++{
			if col<2*n-1{
				if(j==i || j==n){
					fmt.Print("* ")
				}else{
					fmt.Print("  ")
				}
			}else{
				fmt.Print("*")
			}
	
		}
		fmt.Println()
	}
}
