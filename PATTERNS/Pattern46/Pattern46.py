rows = int(input("Enter the number of rows in the butterfly pattern: "))

# Print upper part of the butterfly
for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print(j, end=" ")
    for j in range(1, 2 * (rows - i) + 1):
        print(" ", end=" ")
    for j in range(i, 0, -1):
        print(j, end=" ")
    print()


for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print(" ", end=" ")
    for j in range(rows, i - 1, -1):
        print(j, end=" ")
    for j in range(rows - i, 0, -1):
        print(j, end=" ")
    print()
