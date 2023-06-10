# 1      1
# 12    21
# 123  321
# 12344321

n = int(input("Enter the number of rows:"))
for i in range(1,n+1):
    for j in range(1,i+1):
        print(j,end='')
    for k in range(i,n):
        print("  ",end='')
    for j in range(i,0,-1):
        print(j,end='')
    print()