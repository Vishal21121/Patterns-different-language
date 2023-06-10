

n =  int(input("Enter the row number: "))
for i in range(1,2*n):
    if i==n:
        
        for j in range(1,2*n-1):
            print("*",end='')
        print("*")
        continue
    for j in range (0,n-1):
        print(" ",end='')
    print("*")
