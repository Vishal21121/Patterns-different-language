package main

import "fmt"

func main() {
	var n int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d",&n)
	
	for i:=1; i<=n;i++{
		for j:=n;j>=1;j--{
			if(i==j){
				fmt.Printf("*")
			}else{
				fmt.Printf("%d",j)
			}
		}
		fmt.Println()
	}
}