package main

import "fmt"

func main(){
	var n int;
	fmt.Printf("Enter the number:")
	fmt.Scanln(&n)
	var count int = 0
	for i:= 1; i <= n; i++{
		for j:= 1; j <= i; j++ {
			count++
			fmt.Printf("%d " ,count);
		}
		fmt.Printf("\n")
	}
}