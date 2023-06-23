#include <stdio.h>

void pattern48(int n);

int main()
{
    int n = 0;
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    printf("\n");
    pattern48(n);
}

void pattern48(int n)
{
    int count = 0;

    for (int i = 1; i <= n; i++){
        if (i % 2 == 0){
            count += i;
            for (int j = i - 1; j >= 0; j--){
                printf("%d ", count);
                count--;
            }
            count += i;
        }
        else{
            for (int j = 0; j < i; j++){
                count++;
                printf("%d ", count);
            }
        }
         
        printf("\n");
    }
    printf("\n");
}
