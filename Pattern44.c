#include <stdio.h>

void printPattern(int n)
{
    int i, j;

    // Print top line
    for (i = 0; i < n; i++)
    {
        if(i==0 || i==n-1){
            printf(" ");
            continue;
        }
        printf("*");
    }
    printf("\n");

    // Print middle lines
    for (i = 0; i < n - 2; i++)
    {
        printf("*");
        for (j = 0; j < n - 2; j++)
        {
            printf(" ");
        }
        printf("*\n");
    }

    // Print bottom line
    for (i = 0; i < n; i++)
    {
        if (i == 0 || i == n - 1)
        {
            printf(" ");
            continue;
        }
        printf("*");
    }
    printf("\n");

    // Print additional lines
    for (i = 0; i < n - 2; i++)
    {
        printf("*");
        for (j = 0; j < n - 2; j++)
        {
            printf(" ");
        }
        printf("*\n");
    }

    // Print final line
    for (i = 0; i < n; i++)
    {
        if (i == 0 || i == n - 1)
        {
            printf(" ");
            continue;
        }
        printf("*");
    }
    printf("\n");
}

int main()
{
    int n ;
    printf("Enter an Integer: ");
    scanf("%d",&n);

    printPattern(n);

    return 0;
}
