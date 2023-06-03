def print_pattern(n):
    # Print top line
    for i in range(n):
        if i == 0 or i == n-1:
            print(" ", end="")
            continue
        print("*", end="")
    print()

    # Print middle lines
    for i in range(n - 2):
        print("*" + " " * (n - 2) + "*")

    # Print bottom line
    for i in range(n):
        if i == 0 or i == n-1:
            print(" ", end="")
            continue
        print("*", end="")
    print()

    # Print additional lines
    for i in range(n - 2):
        print("*" + " " * (n - 2) + "*")

    # Print final line
    for i in range(n):
        if i == 0 or i == n-1:
            print(" ", end="")
            continue
        print("*", end="")
    print()


n = int(input("Enter an Integer: "))
print_pattern(n)
