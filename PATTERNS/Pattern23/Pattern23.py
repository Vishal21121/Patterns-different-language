
# **********
# ****  ****
# ***    ***
# **      **
# *        *
# *        *
# **      **
# ***    ***
# ****  ****
# **********

n = int(input("Enter the row number:"))
for i in range(1,2*n+1):
    spaceCount = i if i<=n else 2*n-i+1
    colCount = n if i<=n else  2*i-n-1
    for j in range(i,colCount+1):
        print("*",end='')
    for col in range(2,spaceCount+1):
        print("  ",end='')
    for j in range(i,colCount+1):
        print("*",end='')
    print()

