# E D C B A
# D C B A
# C B A
# B A
# A

n = int(input("Enter the number:"))
val = 64+n
for i in range(1,n+1):
    printable = val
    for j in range(i,n+1):
        print(chr(printable)," ",end='')
        printable = printable - 1 
    val = val -1 
    print()
