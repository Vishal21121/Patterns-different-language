n = int(input("Enter the number of rows: "))
num = 0

    
for i in range(1, n+1):
    if i % 2 == 0:
        num += i
        for j in range(1, i+1):
            print(num, end=" ")
            num -= 1
        num += i
    else:
        for j in range(1, i+1):
            num += 1
            print(num, end=" ")
            
    print()
