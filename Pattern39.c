#include <stdio.h>

int main()
{
    int i, j, k, rows;

    printf("Enter a number: ");
    scanf("%d", &rows);

    for (i = 0; i < rows; i++)
    {
        for (j = 0; j < rows-1-i; j++)
        {
            printf(" ");
        }

        for (k = 0; k < i+1; k++)
        {
            if (i>1 && i < rows-1 && k > 0 && k < i)
            printf("  ");
            else
            printf("* ");
        }
        printf("\n");
    }

    for (i = 0; i < rows - 3; i++)
    {
        for (j = 0; j < rows; j++)
        {
            if (j == 0 || j == rows - 1)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");

    }
    return 0;
}
