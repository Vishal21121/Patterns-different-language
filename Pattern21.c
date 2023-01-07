//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1
#include<stdio.h>

void main() {
	int n;
	int colCount;
	printf("Enter the row number:");
	scanf("%d",&n);
	for (int row= 1; row <= 2*n - 1; row++){
		if (row<=n){
			colCount = row;
		}else{
			colCount = 2 * n - row;
		}
		int spaceCount = n-colCount+1;
		for (int k=1;k<=spaceCount;k++){
			printf(" ");
		}
		for(int col=colCount;col>=1;col--){
			printf("%d",col);
		}
		for (int col=2;col<=colCount;col++){
			printf("%d",col);
		}
		printf("\n");
	}

}