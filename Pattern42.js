
const readline = require('readline');

const FIRST_LETTER = 'A';
const LETTERS_ALPHABET = 26;

const input = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

input.question("Please enter a number\n", (n) => {
  for (let i = 0; i < n * 2; i++) {
    for (let j = 0; j < n - i && i < n; j++) {
      let letter = String.fromCharCode(FIRST_LETTER.charCodeAt(0) + (j % LETTERS_ALPHABET));
      process.stdout.write(`${letter} `);
    }

    for (let j = 0; j < i - n + 1 && i >= n; j++) {
      let letter = String.fromCharCode(FIRST_LETTER.charCodeAt(0) + (j % LETTERS_ALPHABET));
      process.stdout.write(`${letter} `);
    }

    process.stdout.write("\n");
  }

  input.close();
});

