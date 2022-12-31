    #      *
    #     * *
    #    *   *
    #   *     *
    #  *       *
    #   *     *
    #    *   *
    #     * *
    #      *

n = int(input("Enter the row number:"))
for row in range(1,2*n):
    Corep = row if row<=n else 2*n-row
    spaceChange = n-row+1 if row <= n else (row-n)+1
    for space in range(1,spaceChange+1):
        print(" ",end='')
    for col in range(1,Corep+1):
        if (col==1 or col==Corep):
            print("* ",end='')
        else:
            print("  ",end='')
    print()