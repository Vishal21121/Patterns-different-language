#include<stdio.h>

int main()
{
    for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                printf(" ");
            }
            for(int j=0;j<5-i;j++)
            {
                printf("* ");
            }
            printf("\n");
        }
}