package main

import "fmt"

func main(){
	var n int;
	fmt.Print("Enter the number:")
	fmt.Scanln(&n)
	for i:= 1; i <= n; i++ {
	for j:= i; j <= n; j++ {
		fmt.Print(j," ")
	}
	fmt.Print("\n")
	}
}