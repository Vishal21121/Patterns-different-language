#include <stdio.h>

int main() {
    int n;
    printf("Enter Star Dimension: ");
    scanf("%d", &n);

    int rows = 1;
    int totColumns = (n * 2) - 1;
    int auxColumns = totColumns;

    while (rows <= totColumns) {
        if (rows <= n) {
            int j = totColumns - n - rows + 1;
            for (int i = 0; i < j; i++) {
                printf(" ");
            }
            for (int i = j; i < auxColumns; i++) {
                printf("*");
            }
            printf("\n");
            auxColumns -= 2;
            if (rows == n) {
                auxColumns += 2;
            }
        } else {
            auxColumns += 2;
            int j = rows - n;
            for (int i = 0; i < j; i++) {
                printf(" ");
            }
            for (int i = j; i < auxColumns; i++) {
                printf("*");
            }
            printf("\n");
        }
        rows++;
    }

    return 0;
}
