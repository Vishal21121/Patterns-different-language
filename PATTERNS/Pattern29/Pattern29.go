// a
// B c
// D e F
// g H i J
// k L m N o

package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Printf("Enter the number:")
	fmt.Scanf("%d", &n)
	val := 97;
    flag := 0;
    for i:= 1; i <= n; i++{
        for j:= 1; j <= i; j++{
            if (flag == 0){
                fmt.Printf("%c ", val);
                flag = 1;
            }else{
                val = val - 32;
                fmt.Printf("%c ",val);
                flag = 0;
                val+=32;
            }
            val += 1;
        }
        fmt.Printf("\n");
    }
}