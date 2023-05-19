

no = int(input("Enter Star Dimension: "))
print("-------------------------------------")


rows=1


totColumns=(no*2)-1
auxColumns=totColumns

while (rows <= totColumns):
    if(rows <=no ): 
        j=totColumns-no-rows+1
        for i in range(0,j):
          print("",end=' ')
        for i in range(j,auxColumns):
          print("*",end='')
        print()
        auxColumns-=2
        if(rows==no):
           auxColumns+=2
    else:
       auxColumns+=2
       j=rows-no
       for i in range(0,j):
          print("",end=' ')
       for i in range(j,auxColumns):
          print("*",end='')
       print()
    rows+=1

print("-------------------------------------")