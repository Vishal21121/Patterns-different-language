
# *        *
# **      **
# ***    ***
# ****  ****
# **********
# ****  ****
# ***    ***
# **      **
# *        *

n = int(input("Enter the row number:"))
for i in range(1,2*n):
    k = i if(i <= n) else (2 * n - i)
    spaceChange = n-i+1 if i <= n else (i-n)+1
    for j in range(1,k+1):
        print("*",end='')
    for space in range(1,spaceChange):
        print("  ",end='')
    for j in range(1,k+1):
        print("*",end='')
    print()