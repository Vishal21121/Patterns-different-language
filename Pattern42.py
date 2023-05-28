FIRST_LETTER = ord('A')
LETTERS_ALPHABET = 26

n = int(input("Please enter a number\n"))

for i in range(n * 2):
    if i < n:
        for j in range(n - i):
            letter = chr(FIRST_LETTER + (j % LETTERS_ALPHABET))
            print(letter, end=' ')
    else:
        for j in range(i - n + 1):
            letter = chr(FIRST_LETTER + (j % LETTERS_ALPHABET))
            print(letter, end=' ')
    print()
