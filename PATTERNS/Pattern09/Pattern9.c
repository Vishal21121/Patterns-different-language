// 1 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3
// 4 4 4
// 5 5
// 6

#include<stdio.h>

void main(){
    int n;
    printf("Enter the row number:");
    scanf("%d",&n);
    for (int i = 1; i <=n; i++)
    {
        for (int j = i; j <=n; j++)
        {
            printf("%d ",i);
        }
        printf("\n");
        
    }
    
}