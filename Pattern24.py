
# ****
# *  *
# *  *
# *  *
# ****

n = int(input("Enter the row number:"))
for i in range(1,n+1):
    for j in range(1,n):
        if (i==1 or i==n):
            print("*",end='')
        else:
            if (j==1 or j==n-1):
                print("*",end='')
            else:
                print(" ",end='')
    print()
