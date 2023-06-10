    # *********
    #  *     *
    #   *   *
    #    * *
    #     *

n = int(input("Enter the row number:"))

for i in range(1,n+1):
    for k in range(1,i+1):
        print(" ",end='')
    col = 2*n-1 if i==1 else n
    for j in range(i,col+1):
        if(col<2*n-1):
            if(j==i or j==n):
                print("* ",end='')
            else:
                print("  ",end='')
        else:
            print("*",end='')
    print()
