n = int(input("enter a number: "))
rows = n+2
columns = n*2-1
for i in range(0,rows):
    for j in range(0,columns):
        #the conditions 
        if((j == n-1-i) or (j == n-1+i) or (i>n-1 and j == columns-1 ) or (i>n-1 and j == 0) or (i == n-1 and j%2 == 0 )):
            print('*',end=' ')
        else:
            print(' ',end=' ')
    print()