#include <stdio.h>
#include <string.h>
void print_pattern(int n)
{
    // Printing upper pattern
    int space = 0;
    for (int i = 0; i < n; i++)
    {
        if (i == 0)
        {
            printf("*");
            for (int i = 0; i < 2 * n - 2; i++)
            {

                printf(" ");
            }
            printf("*");
        }
        else
        {
            for (int i = 0; i < 2 * n; i++)
            {
                if (i == 0 || i == 2 * n - 1 || i == space + 1 || i == 2 * n - space - 2)
                {
                    printf("*");
                }
                else
                {

                    printf(" ");
                }
            }
            space++;
        }
        printf("\n");
    }
    // Printing the down pattern
    space = n - 2;
    for (int i = 0; i < n; i++)
    {
        if (i == n - 1)
        {
            printf("*");
            for (int i = 0; i < 2 * n - 2; i++)
            {

                printf(" ");
            }
            printf("*");
        }
        else
        {
            for (int i = 0; i < 2 * n; i++)
            {
                if (i == 0 || i == 2 * n - 1 || i == space + 1 || i == 2 * n - space - 2)
                {
                    printf("*");
                }
                else
                {

                    printf(" ");
                }
            }
            space--;
        }
        printf("\n");
    }
}
void print_pattern_down(int n)
{
}
int main(int argc, char const *argv[])
{
    int n;
    printf("Enter the number:");
    scanf("%d", &n);
    print_pattern(n);
    return 0;
}
