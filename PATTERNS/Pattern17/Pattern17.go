 	//     *
    //    * *
    //   *   *
    //  *     *
    // *********

package main

import "fmt"

func main(){
	var n int
	var col int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i:=1;i<=n;i++{
		for k:=i;k<=n;k++{
			fmt.Print(" ")
		}
		if i<n{
			col = i
		}else{
			col = 2*n-1
		}
		for j:=1;j<=col;j++ {
			if col<2*n-1{
				if j==1 || j==i{
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