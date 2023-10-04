//*
//**
//***
//****
//*****
//****
//***
//**
//*

#include <stdio.h>

void main()
{
    int n;
    printf("enter the row number:");
    scanf("%d",&n);

    int j = 1, k = 1, i = 1;
    for (i = 1; i <= (2 * n - 1); i++)
    {
        k = (i <= n) ? i : (2 * n - i);
        for (j = 1; j <= k; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}
