#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                printf(" ");
            }
            int k=n-i+1;
            for(int j=0;j<2*k-1;j++)
            {
                printf("*");
            }
            printf("\n");
        }
}