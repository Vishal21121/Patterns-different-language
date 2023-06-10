#include <stdio.h>
#define FIRST_LETTER 'A'
#define LETTERS_ALPHABET 26

int main()
{
    int n;
    char letter;

    printf("Please enter a number\n");
    scanf("%d", &n);

    for (int i = 0; i < n * 2; i++)
    {
        for (int j = 0; j < n - i && i < n; j++)
        {
            letter = FIRST_LETTER + (j % LETTERS_ALPHABET);
            printf("%c ", letter);
        }

        for (int j = 0; j < i - n + 1 && i >= n; j++)
        {
            letter = FIRST_LETTER + (j % LETTERS_ALPHABET);
            printf("%c ", letter);
        }
        printf("\n");
    }
}