print("Enter n: ")
n = int(input())

for i in range(1, n+1):
    for j in range(i, n+1):
        print(j, end="")
        print(" ", end="")
    

    print("\n", end="");  

    if(i == n):
        break

    for k in range(1, i+1):
        print(" ", end="")
        
        
for i  in range(1, n-1):
    print(" ", end="")

for i in range(1, n):
    for j in range(n-i, n+1):
        print(j, end="")
        print(" ", end="")

    print("\n", end=""); 
    
    for k in range(1, n-i-1):
        print(" ", end="")
        