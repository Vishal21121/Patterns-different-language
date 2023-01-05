#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    for(int i=1;i<=n/2;i++)
    {
        for(int j=0;j<=n/2-i;j++)
        {
            printf("*");
        }
        for(int j=0;j<2*i-2;j++)
        {
            printf(" ");
        }
        for(int j=0;j<=n/2-i;j++)
        {
            printf("*");
        }
        printf("\n");
    }

    for(int i=1;i<=n/2;i++)
    {
        for(int j=0;j<i;j++)
        {
            printf("*");
        }
        for(int j=0;j<2*(n/2-i);j++)
        {
            printf(" ");
        }
        for(int j=0;j<i;j++)
        {
            printf("*");
        }
        printf("\n");
    }
}