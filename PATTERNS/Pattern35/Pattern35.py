n = int(input("Enter the number:"))
for i in range(1, n+1):
    print(" "*(n-i), end="")
    if i == 1 or i == n: #First and last line
        print("*"*n)
    else:
        print("*"+" "*(n-2)+"*")