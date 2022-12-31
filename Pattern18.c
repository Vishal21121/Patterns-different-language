// *********
//  *     *
//   *   *
//    * *
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
        int col = i == 1 ? 2 * n - 1 : n;
        for (int j = i; j <= col; j++)
        {
            if (col < 2 * n - 1)
            {
                if (j == i || j == n)
                {
                    printf("* ");
                }
                else
                {
                    printf("  ");
                }
            }
            else
            {
                printf("*");
            }
        }
        printf("\n");
    }
}