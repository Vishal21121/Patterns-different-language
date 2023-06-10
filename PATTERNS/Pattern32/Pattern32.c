#include <stdio.h>

int main() {
    int n, i, j, k, flag, flag1;
    printf("Enter the input n where row = 2*n - 1: ");
    scanf("%d", &n);
    for (i = 1; i < 2*n; i++) {
        if (i <= n) {
            flag = i;
        } else {
            flag = 2*n - i;
        }
        flag1 = n;
        for (k = flag1; k > 0; k--) {
            printf(" ");
        }
        for (j = flag1; j >= flag; j--) {
            if (j == flag1 || j == flag) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }
    return 0;
}
