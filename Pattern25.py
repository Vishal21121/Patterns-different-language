# 1
# 0 1
# 1 0 1
# 0 1 0 1
# 1 0 1 0 1

n = int(input("Enter the number of rows:"))
for i in range(1,n+1):
    start = 0 if i%2==0 else 1
    for j in range(1,i+1):
        print(start, " ",end='')
        start = 0 if start==1 else 1
    print()