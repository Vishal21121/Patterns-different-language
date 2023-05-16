#include<stdio.h>

int main()
{
    int n;
    printf("Enter the row number: ");
    scanf("%d", &n);

    for (int i = 1; i < 2 * n; i++)
    {
        for (int k = 2 * n - 1; k >= i; k--)
        {
            printf("  ");
        }
        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
            {
                printf("* ");
            }
            else if (i == 2 * n - 1)
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
    return 0;
}