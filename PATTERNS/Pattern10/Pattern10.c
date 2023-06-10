// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F

#include<stdio.h>

void main(){
    int n;
    int val = 64;
    printf("Enter the number:");
    scanf("%d",&n);
    for (int i = 1; i <=n; i++) {
        for(int j=1;j<=i;j++){
            printf("%c ",val+j);
        }
        printf("\n");
    }
}