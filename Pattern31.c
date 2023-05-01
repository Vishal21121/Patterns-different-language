#include<stdio.h>

void main(){
	int i,j,n;
	printf("enter the number:");
	scanf("%d",&n);
	n=n*2-1;
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			if(i==j||j==(n+1)-i){
				printf("*");
			}
			else{
				printf(" ");
			}
		}
		printf("\n");
	}
}
