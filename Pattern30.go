// E D C B A
// D C B A
// C B A
// B A
// A

package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Printf("Enter the number:")
	fmt.Scanf("%d", &n)
	var val int = 64+n;
    for i:=1;i<=n;i++{
        printable := val;
        for j:=i;j<=n;j++{
			fmt.Printf("%c ",printable);
			printable = printable - 1
        }
        val--;
        fmt.Printf("\n");
    }
}