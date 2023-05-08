#include <stdio.h>

int main()
{
    int n = 0;
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
            printf("+\n");
    }
    return 0;
}