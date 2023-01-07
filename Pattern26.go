// 1      1
// 12    21
// 123  321
// 12344321

package main
import "fmt"
func main(){

    var n int;
    fmt.Print("Enter the number of rows:");
    fmt.Scanf("%d", &n);
    for i:= 1; i <= n; i++{
        for j:= 1; j <= i; j++{
            fmt.Printf("%d",j);
        }
        for k:= i; k <= n - 1; k++{
            fmt.Printf("  ");
        }
        for j:= i; j >= 1; j--{
            fmt.Printf("%d", j);
        }
        fmt.Print("\n");
    }
}