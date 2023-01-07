// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

#include <stdio.h>

void main()
{
    int n;
    int start;
    printf("Enter the number of rows:");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        start = i % 2 == 0 ? 0 : 1;
        for (int j = 1; j <= i; j++)
        {
            printf("%d ", start);
            start = start == 1 ? 0 : 1;
        }
        printf("\n");
    }
}