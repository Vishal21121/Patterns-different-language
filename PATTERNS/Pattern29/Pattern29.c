// a
// B c
// D e F
// g H i J
// k L m N o

#include <stdio.h>

void main()
{
    int n;
    printf("Enter the number:");
    scanf("%d", &n);
    int val = 97;
    int flag = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if (flag == 0)
            {
                printf("%c ", (char)(val));
                flag = 1;
            }
            else
            {
                val = val - 32;
                printf("%c ", (char)(val));
                flag = 0;
                val+=32;
            }
            val += 1;
        }
        printf("\n");
    }
}