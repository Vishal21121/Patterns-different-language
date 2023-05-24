// n=5
// 10101
// 01010
// 10101
// 01010
// 10101

#include<stdio.h>

void main() {
    int n, row, col;
    printf("Enter n: ");
    scanf("%d",&n);
    for(row = 0; row < n; row++) {
        for(col = 0; col < n; col++) {
            if (col%2==0) printf("%d", ((row+1)%2));
            else printf("%d", (row%2));
        }
        printf("\n");
    }
}