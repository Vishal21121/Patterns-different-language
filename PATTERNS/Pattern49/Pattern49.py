
def isPrime(n):
    for i in range(2,n):
        if n % i == 0:
            return False
    return True

def prime(count):
    i = 1
    while(True):
        i += 1
        if isPrime(i):
            if count == 1:
                return i
            count -= 1

n = int(input("Enter the number of rows:"))

count = 1
        
for i in range(n+1):
    print(" " * (n-i), end="")
    for j in range(i):
        print(prime(count),end = " ")
        count += 1
    print()