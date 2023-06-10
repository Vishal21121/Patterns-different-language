#include<stdio.h>

void main(){

    int i, k, n;

    printf("Enter the number: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        // padding front space
        for (k = n-i-1; k >= 0; k--) {
            printf(" ");
        }
        // left star boarder
        printf("*");
        // inner stars
        for (k = n - 2; k > 0; k--) {
            if (i == 0 || i == (n - 1)) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        // right star boarder
        printf("*\n");
    }
}
