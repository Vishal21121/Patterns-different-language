#include <stdio.h>

int main()
{
    int i, j, k, n;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n - 1 - i; j++)
        {
            printf(" ");
        }

        for (k = 0; k < i + 1; k++)
        {
            if(i>1 && i<n-1 && k>0 && k<i)
            printf("  ");
            else
            printf("* ");
        }
        printf("\n");
    }

    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (j == 0 || j == n - 1)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");

    }
    return 0;
}
