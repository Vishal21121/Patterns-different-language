
#  ***
# *   *
# *   *
# *   *
#  ***
# *   *
# *   *
# *   *
#  ***


n = int(input("Enter the number:"))

for i in range(1, (n*2)+1 ):
    if i == 1 or i == n or i == n*2: #First, last and middle lines
        print(" " + "*"*(n-2))
    else:
        print("*"+" "*(n-2)+"*")
