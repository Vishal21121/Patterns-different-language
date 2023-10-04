package main

import "fmt"

func main(){

var  n int;
fmt.Printf("Enter the row number:")
fmt.Scanln(&n)
var flag int;

for i:=1;i<=2*n;i++{
     if i<=n{
		flag = i;
	 }else {
		flag = 2*n-i+1
	 }
    var flag1 int = n;
    for k:=1 ;k<=flag;k++{
       fmt.Printf(" ")
    }
    for j:=flag1;j>=flag;j--{
        fmt.Printf("* ");
    }
    fmt.Printf("\n")
}
}

