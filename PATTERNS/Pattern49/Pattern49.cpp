#include<iostream>
#include <math.h>
using namespace std;

int isPrime(int num) {
    if (num <= 1) {
        return 0;
    }
    
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return 0;
        }
    }
    
    return 1;
}

void printLineOfPrimes(int offset, int lineDigits, int max) {
    if (lineDigits >= max) {
        return;
    }
    
    int primesInThisLine = 0;

    int space = max - lineDigits;

    for(int i = 0; i < space ; i++){
        cout << "  ";
    }

    while (primesInThisLine < lineDigits) {
        if (isPrime(offset)) {
            cout << offset << "  ";
            primesInThisLine++;
        }
        
        offset++;
    }
    
    cout << endl;
    printLineOfPrimes(offset, ++lineDigits, max);
}

int main() {
    int n;
    printf("Enter the number of lines N : ");
    cin >> n;
    
    printLineOfPrimes(1, 1, n + 1);
    
    return 0;
}