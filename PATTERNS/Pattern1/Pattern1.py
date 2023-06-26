n = int(input("Enter the number of rows:"))

#Printing the top half of the pattern

for i in range(0,n):
    print(" " * i, sep = "", end="")
    print("* " * (n-i), sep = "")


#Printing the bottom half of the pattern

for i in range(1,n+1):
    print(" " * (n-i), sep = "", end="")
    print("* " * i , sep = "")