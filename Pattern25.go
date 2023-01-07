// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

package main

import "fmt"

func main() {
	var n int
	var start int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)
	for i:=1;i<=n;i++{
		if i%2==0{
			start = 0
		}else{
			start = 1
		}
		for j:=1;j<=i;j++{
			fmt.Print(start, " ")
			if start==0{
				start = 1
			}else{
				start = 0
			}
		}
		fmt.Println()
	}
}
