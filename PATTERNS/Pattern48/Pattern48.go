package main

import "fmt"

func main() {
	var n,I int
	fmt.Print("Enter the row number:")
	fmt.Scanf("%d",&n)
	
	for k,i := 1,1;i<=n;i++{
		I = k+i-1;
		for j:=1;j<=i;j++{
			if i%2==1{
				fmt.Printf("%d ",k);
			}else{
				fmt.Printf("%d ",I);
			}
			k++;
			I--;
		}
		fmt.Println()
	}
}