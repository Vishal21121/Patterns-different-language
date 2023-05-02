
# *       * 
#  *     *  
#   *   *   
#    * *    
#     *     
#    * *    
#   *   *   
#  *     *  
# *       * 

n = int(input("enter the row number:"))
for i in range(1,2*n):
    if( i <= n):
        flag = i
    else :
        flag = 2*n - i
    flag1 = n
    for k in range(1,flag+1):
        print(" ",end='')
    for j in range(flag1,flag-1,-1):
        if (j == flag1 or j == flag):
           print("* ",end='')
        else:
            print("  ",end='')
    print()

