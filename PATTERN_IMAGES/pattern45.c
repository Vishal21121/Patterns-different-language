#include <stdio.h>

int main() {
    int n, i, j;

    printf("Enter the row number: ");
    scanf("%d", &n);

    for (i = n; i >= 1; i--) {
        for (j = n; j >= 1; j--) {
            if (j == i)
                printf("*");
            else
                printf("%d", j);
        }
        printf("\n");
    }

    return 0;
}
