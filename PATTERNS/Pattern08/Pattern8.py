# 1
# 2  3
# 4  5  6
# 7  8  9  10
# 11 12 13 14 15

n = int(input("enter the row number:"))
count = 0
for i in range(1,n+1):
    for j in range(1,i+1):
        count=count+1
        print(count," ",end='')
    print()