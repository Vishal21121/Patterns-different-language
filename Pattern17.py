    #      *
    #     * *
    #    *   *
    #   *     *
    #  *********

n = int(input("Enter the number:"))
for i in range(1,n+1):
    for k in range(i,n+1):
        print(" ",end='')
    col = i if i<n else 2*n-1
    for j in range(1,col+1):
        if (col<2*n-1):
            if(j==1 or j==i):
                print("* ",end='')
            else:
                print("  ",end='')
        else:
            print("*",end='')
    print()
