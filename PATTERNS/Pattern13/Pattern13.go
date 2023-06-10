package main

import "fmt"

func main(){
	var n int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d", &n)

	for i:=1;i<=n;i++{
		for k:=i;k<=n;k++{
			fmt.Print(" ")
		}
		for j:=1;j<=i;j++{
			fmt.Print("*")
		}
		fmt.Println()
		
	}
}