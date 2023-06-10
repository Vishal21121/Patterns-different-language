n = int(input("Enter the row number:"))
for i in range(1, 2*n):
    for k in range(2*n - 1, i-1, -1):
        print("  ", end="")
    for j in range(1, i+1):
        if j == 1 or j == i:
            print("* ", end="")
        elif i == 2*n-1:
            print("* ", end="")
        else:
            print("  ", end="")
    print()

