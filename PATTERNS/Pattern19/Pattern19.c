//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *

#include <stdio.h>

void main()
{
    int n;
    int Corep;
    int spaceChange;
    printf("Enter the row number:");
    scanf("%d", &n);

    for (int row = 1; row <= 2 * n - 1; row++)
    {
        Corep = row <= n ? row : 2 * n - row;
        spaceChange = row <= n ? n - row + 1 : (row - n) + 1;
        for (int k = 1; k <= spaceChange; k++)
        {
            printf(" ");
        }
        for (int col = 1; col <= Corep; col++)
        {
            if (col == 1 || col == Corep)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }
}
