#include <stdio.h>

void main()
{

    int n;
    printf("Enter the row number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {

        for (int j = 1; j <= i; j++)
        {
            if (j == i || j == 1)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }

        for (int space = 2 * (n - i); space > 0; space--)
        {
            printf(" ");
        }

        for (int k = 1; k <= i; k++)
        {
            if (k == 1 || k == i)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }

    for (int i = n; i > 0; i--)
    {

        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }

        int spaces = 2 * (n - i);
        for (int j = 1; j <= spaces; j++)
        {
            printf(" ");
        }

        for (int j = 1; j <= i; j++)
        {
            if (j == 1 || j == i)
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }
}