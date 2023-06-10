// E
// D E
// C D E
// B C D E
// A B C D E

#include<stdio.h>

void main(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    for (int i = 0; i <n; i++)
    {
        int val = n-i;
        for (int j = 0; j <=i; j++)
        {   
            printf("%c ",(char)(64+val+j));
        }
        printf("\n");
    }
    
}