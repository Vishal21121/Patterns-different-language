#include <stdio.h>
int main() {
    int n;
    printf("Enter the row number: ");
    scanf("%d", &n);
    
    for (int i = 1; i <= 2 * n; i++) {
        int flag = (i <= n) ? i : (2 * n - i + 1);
        int flag1 = n;
        for (int k = 1; k <= flag; k++) {
            printf(" ");
        }
        for (int j = flag1; j >= flag; j--) {
            printf("* ");
        }
        printf("\n");
    }
    
    return 0;
}
