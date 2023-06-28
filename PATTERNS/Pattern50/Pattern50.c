#include<stdio.h>
int main() 
    {
        int n;
        printf("Enter the number of rows:");
        scanf("\n%d",&n);
        int num = 2;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i % (n - 1) == 0) {
                for (int j = 0; j < n; j++) {
                    printf("%d ",num);
                    num += 2;
                }
                printf("\n");
            } else {
                printf("%d\n",num);
                num += 2;
            }
        }
    }