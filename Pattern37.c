/**
 * C program to print left arrow star pattern
 */

#include <stdio.h>

int main()
{
    int i, j, n;

    // Input number of rows from user
    printf("Enter value of n : ");
    scanf("%d", &n);

    // Print upper part of the arrow
    for(i=1; i<n; i++)
    {
        // Print trailing (n-rownumber) spaces
        for(j=1; j<=(n-i); j++)
        {
            printf(" ");
        }

        // Print inverted right triangle
        for(j=i; j<=n; j++)
        {
            printf("*");
        }

        printf("\n");
    }

    // Print bottom part of the arrow
    for(i=1; i<=n; i++)
    {
        // Print trailing (rownumber-1) spaces
        for(j=1; j<i; j++)
        {
            printf(" ");
        }

        // Print the right triangle
        for(j=1; j<=i; j++)
        {
            printf("*");
        }

        printf("\n");
    }

    return 0;
}