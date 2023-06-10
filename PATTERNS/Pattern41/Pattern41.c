#include<stdio.h>

void main() {
    int n, row, col;
    printf("Enter n: ");
    scanf("%d",&n);

    for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++){
                printf("%d", j);
                printf(" ");
            }

           printf("\n");  

           if(i == n)
                break;

           for(int k=1; k<=i; k++)
                printf(" ");
        }
        
        for(int i=1; i<=n-2; i++)
            printf(" ");

        for(int i=1; i<n; i++) {
            for(int j=n-i; j<=n; j++){
                printf("%d", j);
                printf(" ");
            }

           printf("\n");
            
           for(int k=1; k<n-i-1; k++)
                printf(" ");
        }
}