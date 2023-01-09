# E
# D E
# C D E
# B C D E
# A B C D E

n = int(input("Enter the number:"))
for i in range(0,n):
    val = n - i
    for j in range(0,i+1):
        print(chr(64+val+j)," " ,end='')
    print()