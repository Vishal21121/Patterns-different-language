#include <stdio.h>

int main()
{
    int n = 0;
    printf("Please enter a number: ");
    scanf("%d", &n);
    for (int i = 0; i < (2*n - 1); i++)
    {
        if (i == (n - 1))
        {
            for (int j = 0; j < (2*n - 1); j++)
            {
                printf("+");
            }
            printf("\n");
        }
        else
        {
            for (int j = 0; j < (n-1); j++)
            {
                printf(" ");
            }
            printf("+");
            for (int j = 0; j < (n-1); j++)
            {
                printf(" ");
            }
            printf("\n");
        }
    }
    return 0;
}