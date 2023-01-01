    #         1
    #       2 1 2
    #     3 2 1 2 3
    #   4 3 2 1 2 3 4
    # 5 4 3 2 1 2 3 4 5

n = int(input("Enter the number:"))
for i in range(1,n+1):
    for k in range(i,n+1):
        print("   ",end='')
    for j in range(i,0,-1):
        print(j," ",end='')
    for p in range(2,i+1):
        print(p," ",end='')
    print()
