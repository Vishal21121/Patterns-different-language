def draw_alphabet_A(n):
    rows = n+2
    for i in range(rows):
        for j in range(rows-i-1):
            print(" ", end="")
        
        for k in range(2*i+1):
            if k == 0 or k == 2*i:
                print("*", end="")
            elif i == rows//2:
                print("*", end="")
            else:
                print(" ", end="")
        
        print()


draw_alphabet_A(7)
