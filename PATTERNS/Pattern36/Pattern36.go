package main

import "fmt"

func main() {
	n := 7
	for i := 1; i <= n; i++ {
		for j := 1; j <= n; j++ {
			if i <= (n+1)/2 {
				if i == 1 && (j == 1 || j >= (n+1)/2) {
					fmt.Print("* ")
				} else if i > 1 && j == (n+1)/2 || j == 1 {
					fmt.Print("* ")
				} else if i == (n+1)/2 {
					fmt.Print("* ")
				} else {
					fmt.Print("  ")
				}
			} else {
				if i < n && (j == (n+1)/2 || j == n) {
					fmt.Print("* ")
				} else if i == n && (j <= (n+1)/2) || j == n {
					fmt.Print("* ")
				} else {
					fmt.Print("  ")
				}
			}
		}
		fmt.Println()
	}
}
