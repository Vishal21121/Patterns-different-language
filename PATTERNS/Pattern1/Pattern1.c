#include <stdio.h>

int main()
{
    int rows;
    
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    
    // Print upper half of the pyramid
    for (int i = 0; i < rows; i++)
    {
        // Print spaces
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }

        // Print stars
        for (int j = 0; j < rows - i; j++)
        {
            printf("* ");
        }

        printf("\n");
    }
    
    // Print lower half of the pyramid
    for (int i = 0; i < rows; i++)
    {
        // Print spaces
        for (int j = 0; j < rows - i - 1; j++)
        {
            printf(" ");
        }
        
        // Print stars
        for (int j = 0; j <= i; j++)
        {
            printf("* ");
        }
        
        printf("\n");
    }

    return 0;
}
