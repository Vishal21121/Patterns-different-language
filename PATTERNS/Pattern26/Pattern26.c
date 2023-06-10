// 1      1
// 12    21
// 123  321
// 12344321

#include <stdio.h>
void main()
{
    int n;
    printf("Enter the number of rows:");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d",j);
        }
        for (int k = i; k <= n - 1; k++)
        {
            printf("  ");
        }
        for (int j = i; j >= 1; j--)
        {
            printf("%d", j);
        }
        printf("\n");
    }
}