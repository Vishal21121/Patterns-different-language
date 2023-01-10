// E D C B A
// D C B A
// C B A
// B A
// A

#include<stdio.h>

void main(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    int val = 64+n;
    for(int i=1;i<=n;i++){
        int printable = val;
        for(int j=i;j<=n;j++){
            printf("%c ",(char)(printable--));
        }
        val--;
        printf("\n");
    }
}