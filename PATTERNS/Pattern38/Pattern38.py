def print_pattern_38(n):
    n *= 2
    for i in range(0, n):
        output = ""
        for j in range(0, n):
            if j == 0 or j == i or j == n - i - 1 or j == n - 1:
                output += "*"
            else:
                output += " "
        print(output)

n = int(input("enter a number : "))
print_pattern_38(n)