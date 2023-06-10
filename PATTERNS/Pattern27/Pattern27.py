    # 4 4 4 4 4 4 4  
    # 4 3 3 3 3 3 4   
    # 4 3 2 2 2 3 4   
    # 4 3 2 1 2 3 4   
    # 4 3 2 2 2 3 4   
    # 4 3 3 3 3 3 4   
    # 4 4 4 4 4 4 4 

n = int(input("Enter the number:"))
for i in range(0,2*n-1):
    for j in range(0,2*n-1):
        val = n-(min(min(j,2*(n-1)-j),min(i,2*(n-1)-i)))
        print(val,"",end='')
    print()