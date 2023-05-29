/*
  This is the first Aproach
  
  Before running this code you have to First, install the prompt-sync package 
  by running the following command in your Node.js 
  
  *** npm install prompt-sync ***

*/


const prompt = require('prompt-sync')();

// Constants for the first letter and number of letters in the alphabet

const FIRST_LETTER = 'A';
const LETTERS_ALPHABET = 26;

// Main function
function main() {
  // Prompt the user to enter a number
  let n = parseInt(prompt("Please enter a number : "));

for (let i = 0; i < n * 2; i++) {
      for (let j = 0; j < n - i && i < n; j++) {
        let letter = String.fromCharCode(FIRST_LETTER.charCodeAt(0) + (j % LETTERS_ALPHABET));
        console.log(`${letter} `);
      }

      for (let j = 0; j < i - n + 1 && i >= n; j++) {
        let letter = String.fromCharCode(FIRST_LETTER.charCodeAt(0) + (j % LETTERS_ALPHABET));
        console.log(`${letter} `);
      }

      console.log("\n");
    }
}

// Call the main function to start the program
main();

/* Second Aproach

const readline = require('readline');

const FIRST_LETTER = 'A';
const LETTERS_ALPHABET = 26;

const rl = readline.createInterface({
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

  rl.close();
});
*/
