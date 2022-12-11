// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15
#include <stdio.h>

void main()
{
    int n;
    printf("Enter the row number:");
    scanf("%d", &n);
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d ", ++count);
        }
        printf("\n");
    }
}