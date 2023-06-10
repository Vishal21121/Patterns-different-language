print("Enter n: ")
n = int(input())
for row in range(n):
    for col in range(n):
        if (col%2 == 0): print((row+1)%2, end="")
        else: print(row%2, end="")
    print()