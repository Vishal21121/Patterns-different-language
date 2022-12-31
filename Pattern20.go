    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

package main

import "fmt"

func main() {
	var n int
	fmt.Println("Enter the row number:")
	fmt.Scanf("%d",&n)

	for i:= 1; i <=n; i++ {
		for k:= i;k<=n;k++{
			fmt.Print("  ");
		}
		for j:= i;j>=1;j--{
			fmt.Print(j," ");
		}
		for p:= 2;p<=i;p++{
			fmt.Print(p," ");
		}
		fmt.Println()
	}
}