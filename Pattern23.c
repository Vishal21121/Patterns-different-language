// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

#include <stdio.h>

void main()
{
    int n;
    printf("Enter the number of rows:");
    scanf("%d", &n);
    for (int i = 1; i <= 2 * n; i++)
    {
        int spaceCount = i <= n ? i : 2 * n - i + 1;
        int colCount = i <= n ? n : 2 * i - n - 1;
        for (int j = i; j <= colCount; j++)
        {
            printf("*");
        }
        for (int col = 2; col <= spaceCount; col++)
        {
            printf("  ");
        }
        for (int j = i; j <= colCount; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}