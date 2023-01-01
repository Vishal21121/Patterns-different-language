#     1
#    212
#   32123
#  4321234
#   32123
#    212
#     1

n = int(input("Enter the row number:"))
for row in range(1,2*n):
    colCount = row if row<=n else 2*n-row
    spaceCount = n-colCount
    for k in range(1,spaceCount+1):
        print(" ",end='')
    for col in range(colCount,0,-1):
        print(col,end='')
    for col in range(2,colCount+1):
        print(col,end='')
    print()
