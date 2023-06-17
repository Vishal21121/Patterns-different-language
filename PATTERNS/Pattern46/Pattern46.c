#include <stdio.h>

int main() {
    int rows;
    printf("Enter the number of rows: ");
    scanf("%d", &rows); // Number of rows
    
    // Print the upper half of the butterfly pattern
    for (int i = 1; i <= rows; i++) {
        // Print numbers in increasing order
        for (int j = 1; j <= i; j++) {
            printf("%d ", j);
        }
        
        // Print spaces
        for (int j = 1; j <= 2 * (rows - i); j++) {
            printf("  ");
        }
        
        // Print numbers in decreasing order
        for (int j = i; j >= 1; j--) {
            printf("%d ", j);
        }
        
        printf("\n");
    }

    // Print the lower half of the butterfly pattern
    for (int i = 1; i <= rows; i++) {
        // Print spaces
        for (int j = 1; j <= i; j++) {
            printf("  ");
        }
        
        // Print numbers in decreasing order
        for (int j = rows; j >= i; j--) {
            printf("%d ", j);
        }
        
        // Print numbers in decreasing order
        for (int j = rows - i; j >= 1; j--) {
            printf("%d ", j);
        }
        
        printf("\n");
    }

    return 0;
}
