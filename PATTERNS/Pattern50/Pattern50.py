n = int(input("Enter the number of rows:"))

def print_pattern(n):
    num = 2
    for i in range(9):
        if i % 4 == 0:
            for j in range(n):
                print(num, end=' ')
                num += 2
            print()
            
        else:
            print(num)
            num += 2

print_pattern(n)
