// 4 4 4 4 4 4 4  
// 4 3 3 3 3 3 4   
// 4 3 2 2 2 3 4   
// 4 3 2 1 2 3 4   
// 4 3 2 2 2 3 4   
// 4 3 3 3 3 3 4   
// 4 4 4 4 4 4 4 

#include<stdio.h>

int min(int a, int b){
    return a<b ? a : b;
}

void main(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    for (int i = 0; i <2*n-1;i++) {
            for(int j=0;j<2*n-1;j++){
                int val = n-(min(min(j,2*(n-1)-j),min(i,2*(n-1)-i)));
                printf("%d ",val);
            }
            printf("\n");
    }
}