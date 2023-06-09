*     * * * * 
*     *       
*     *       
* * * * * * * 
      *     * 
      *     * 
* * * *  
  
  
#include <stdio.h>

int main() {
    int n = 7;
    int i, j;
    
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            if (i <= (n + 1) / 2) {
                if (i == 1 && (j == 1 || j >= (n + 1) / 2)) {
                    printf("* ");
                }
                else if (i > 1 && (j == (n + 1) / 2 || j == 1)) {
                    printf("* ");
                }
                else if (i == (n + 1) / 2) {
                    printf("* ");
                }
                else {
                    printf("  ");
                }
            }
            else {
                if (i < n && (j == (n + 1) / 2 || j == n)) {
                    printf("* ");
                }
                else if (i == n && (j <= (n + 1) / 2 || j == n)) {
                    printf("* ");
                }
                else {
                    printf("  ");
                }
            }
        }
        printf("\n");
    }
    
    return 0;
}
