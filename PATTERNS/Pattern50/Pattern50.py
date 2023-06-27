n = int(input("Enter the number of rows:"))

def print_pattern(n):
    num = 2
    for i in range(2*n-1):
        if i==0 or i==n-1 or i==2*n-2:
            for j in range(n):
                print(num, end=' ')
                num += 2
            print()
            
        else:
            print(num)
            num += 2

print_pattern(n)
