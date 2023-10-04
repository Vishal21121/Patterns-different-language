//*
//**
//***
//****
//*****
//****
//***
//**
//*
import java.util.Scanner;
public class Pattern3{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int n = in.nextInt();

        int j = 1, k = 1,i=1;
        for(i=1;i<=(2*n-1);i++){
           k = (i<=n)? i:(2*n-i);
           for(j=1;j<=k;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
