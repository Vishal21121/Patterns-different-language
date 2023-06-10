// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

#include <stdio.h>

void main()
{
    int n;
    printf("Enter the row number:");
    scanf("%d", &n);
    for (int i = 1; i <= (2 * n - 1); i++)
    {
        int k = (i <= n) ? i : (2 * n - i);
        int spaceChange = i <= n ? n - i + 1 : (i - n) + 1;
        for (int j = 1; j <= k; j++)
        {
            printf("*");
        }
        for (int space = 1; space < spaceChange; space++)
        {
            printf("  ");
        }
        for (int j = k; j >= 1; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}