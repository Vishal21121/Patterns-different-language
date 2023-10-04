package main

import "fmt"

func main(){
	var n int;
	fmt.Printf("Enter the number:");
	fmt.Scanf("%d",&n);
	for i:= 1; i <= n; i++{
		for j:= i; j <= n; j++ {
			fmt.Printf("%d ",i);
		}
		fmt.Printf("\n");

	}
}