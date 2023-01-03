// *****
// ****
// ***
// **
// *

#include <stdio.h>

void main()
{
    int n;
    printf("Enter the number of row:");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        for (int j = i; j <= n; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}