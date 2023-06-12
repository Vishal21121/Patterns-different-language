n = 5

# Upper half of the pattern
for i in range(n-1):
    print(" " * i + "* " * (n - i))

# Lines 5 and 6
print(" " * (n-1) + "*")
print(" " * (n-1) + "*")

# Lower half of the pattern
for i in range(n-2, -1, -1):
    print(" " * i + "* " * (n - i))
