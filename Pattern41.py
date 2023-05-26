print("Enter n: ", end="")
n = int(input())
cont = []

for i in range(n):
    tempstr = ""
    tempstr += (" "*i)
    for j in range(i+1, n+1):
        tempstr += str(j)+" "
    if (not (i == (n-1))): cont.append(tempstr)
    print(tempstr)

for i in range(n-2, -1, -1):
    print(cont[i])