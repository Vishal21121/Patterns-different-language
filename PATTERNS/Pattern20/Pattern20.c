    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

#include<stdio.h>

void main(){
    int n;
    printf("Enter the row number:");
    scanf("%d",&n);
    for (int i = 1; i <=n; i++) {
    for(int k = i;k<=n;k++){
        printf("  ");
    }
    for(int j = i;j>=1;j--){
        printf("%d ",j);
    }
    for(int p = 2;p<=i;p++){
        printf("%d ",p);
    }
    printf("\n");
}
}