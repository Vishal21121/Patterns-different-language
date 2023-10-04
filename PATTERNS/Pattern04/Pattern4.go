package main

import "fmt"

func main(){
	var num int
	fmt.Printf("Enter the row number:");
	fmt.Scanln(&num)
	for  i:=1;i<=num;i++{
		for j:=1;j<=i;j++{
			fmt.Printf("%d ",j)
		}
		fmt.Printf("\n")
	}
}

