// ****
// *  *
// *  *
// *  *
// ****

#include <stdio.h>
void main()
{
    int n ;
    printf("Enter the number of rows:");
    scanf("%d",&n);
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - 1; j++)
        {
            if (i == 1 || i == n)
            {
                printf("*");
            }
            else
            {
                if (j == 1 || j == n - 1)
                {
                    printf("*");
                }
                else
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
}