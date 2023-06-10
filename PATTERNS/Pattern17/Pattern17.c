//     *
//    * *
//   *   *
//  *     *
// *********

#include <stdio.h>

void main()
{
    int n;
    printf("Enter the row number:");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        for (int k = i; k <= n; k++)
        {
            printf(" ");
        }
        int col = i < n ? i : 2 * n - 1;
        for (int j = 1; j <= col; j++)
        {
            if (col < 2 * n - 1)
            {
                if (j == 1 || j == i)
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