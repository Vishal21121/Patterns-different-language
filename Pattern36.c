#include<stdio.h>
void main()
{
 /* Declare variables*/
 int i,j,no;
 
 printf("Enter the number:\n");
 scanf("%d",&no);
 /* Run loops*/
 for(i=1;i<=no*2-1;i++)
 {
  for(j=1;j<=no*2-1;j++)
  {
/* Conditions for print stars*/
 if(i==no||j==no||i==1&&j>no||i<no&&j==1||i>no&&j==no*2-1||i==no*2-1&&j<no)
   {
  printf(" *");
   }
   else
   {
  printf("  ");
   }
  }
  printf("\n");
 } 
}  