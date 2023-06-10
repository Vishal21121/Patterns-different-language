// *****
//  ****
//   ***
//    **
//     *

#include <stdio.h>

void main()
{
    int n;
    printf("Enter the row number:");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        for (int k = 1; k <= i; k++)
        {
            printf(" ");
        }
        for (int j = i; j <= n; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}