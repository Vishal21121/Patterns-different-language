n = int(input("Enter the number:"))
val = 97
flag = 0
for i in range(1,n+1):
    for j in range(1,i+1):
       if flag == 0:
            print(chr(val)," ",end='')
            flag = 1
       else:
            val = val - 32;
            print(chr(val)," ",end='')
            flag = 0
            val+=32
       val = val + 1
    print()