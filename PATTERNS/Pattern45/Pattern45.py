rows = int(input("Enter the number of rows: "))

for i in range(1, rows + 1):
    # Print spaces
    for j in range(1, rows - i + 1):
        print(" ", end="")

    # Print stars for left diagonal
    for k in range(1, i + 1):
        print("*", end="")

    # Print stars for right diagonal
    for k in range(i - 1, 0, -1):
        print("*", end="")

    print()  # Move to the next line

for i in range(rows - 1, 0, -1):
    # Print spaces
    for j in range(1, rows - i + 1):
        print(" ", end="")

    # Print stars for left diagonal
    for k in range(1, i + 1):
        print("*", end="")

    # Print stars for right diagonal
    for k in range(i - 1, 0, -1):
        print("*", end="")

    print()  # Move to the next line
