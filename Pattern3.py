
# *
# **
# ***
# ****
# *****
# ****
# ***
# **
# *

n = int(input("enter the number of rows:"))

j = 1
k = 1
i = 1
for i in range(2 * n):
    k = i if(i <= n) else (2 * n - i)
    for j in range(1,k+1):
        print("*",end='')
    print()