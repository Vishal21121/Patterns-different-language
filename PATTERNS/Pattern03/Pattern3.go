//*
//**
//***
//****
//*****
//****
//***
//**
//*


package main

import "fmt"

func main(){
	
var  n int;
fmt.Printf("Enter the row number:")
fmt.Scanln(&n)
var k int;
for i:= 1; i <= (2 * n - 1); i++ {
	if i<=n {
		k = i;
	}else{
		k = (2*n-i)
	}
    for j:= 1; j <= k; j++ {
        fmt.Printf("*");
    }
    fmt.Printf("\n")
}
}