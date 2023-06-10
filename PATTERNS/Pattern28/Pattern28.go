// E
// D E
// C D E
// B C D E
// A B C D E

package main

import "fmt"

func main(){
	var n int;
    fmt.Printf("Enter the number:");
    fmt.Scanf("%d",&n);
    for i:= 0; i <n; i++{
        val:= n-i;
        for j:= 0; j <=i; j++{   
            fmt.Printf("%c ",64+val+j);
        }
        fmt.Printf("\n");
    }
}