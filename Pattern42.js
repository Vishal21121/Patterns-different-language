// Constants for the first letter and number of letters in the alphabet
const FIRST_LETTER = 'A';
const LETTERS_ALPHABET = 26;

// Main function
function main() {
  // Prompt the user to enter a number
  let n = parseInt(prompt("Please enter a number"));

  // Outer loop for rows
  for (let i = 0; i < n * 2; i++) {
    // Check if we are in the first half of rows
    if (i < n) {
      // Inner loop for printing letters in ascending order
      for (let j = 0; j < n - i; j++) {
        // Calculate the current letter based on the first letter and alphabet size
        let letter = String.fromCharCode(FIRST_LETTER.charCodeAt(0) + (j % LETTERS_ALPHABET));
        console.log(letter + ' ');
      }
    } else { // We are in the second half of rows
      // Inner loop for printing letters in descending order
      for (let j = 0; j < i - n + 1; j++) {
        // Calculate the current letter based on the first letter and alphabet size
        let letter = String.fromCharCode(FIRST_LETTER.charCodeAt(0) + (j % LETTERS_ALPHABET));
        console.log(letter + ' ');
      }
    }
    // Print a new line after each row
    console.log('\n');
  }
}

// Call the main function to start the program
// main();

// Run the main function when the page is loaded
window.addEventListener('load', main);
