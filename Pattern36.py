n = 7
for i in range (1,n+1):
    for j in range (1,n+1): 
        if (i <= (n+1)/2) :
            if (i == 1 and (j == 1 or j >= (n+1)/2)) :
                print("* ",end="")
            elif (i > 1 and j == (n+1)/2 or j == 1):
                print("* ",end="")
            elif(i==(n+1)/2):
                print("* ",end="")
            
            else:
                print("  ",end="")
        else:
            if(i<n and (j==(n+1)/2 or j==n)):
                print("* ",end="")
            elif (i==n and (j<=(n+1)/2) or j==n):
                print("* ",end="")
            
            else:
                print("  ",end="")
    print()
            