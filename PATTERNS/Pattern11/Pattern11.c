//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *

#include<stdio.h>

void main(){
    int n;
    printf("Enter the number of row:");
    scanf("%d",&n);
    for (int row = 1; row <= 2*n-1; row++) {
    int Corep = row<=n ? row: 2*n-row;
    int spaceChange = row <= n ? n-row+1: (row-n)+1;
    for (int space = 1; space <= spaceChange; space++) {
        printf(" ");
    }
    for (int col = 1; col <= Corep; col++) {
        printf("* ");
    }
    printf("\n");
}
}