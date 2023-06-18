const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the number of rows: ', (rows) => {
  // Convert rows to a number
  rows = parseInt(rows);

  // Print the upper half of the butterfly pattern
  for (let i = 1; i <= rows; i++) {
    // Print numbers in increasing order
    for (let j = 1; j <= i; j++) {
      process.stdout.write(j + ' ');
    }

    // Print spaces
    for (let j = 1; j <= 2 * (rows - i); j++) {
      process.stdout.write('  ');
    }

    // Print numbers in decreasing order
    for (let j = i; j >= 1; j--) {
      process.stdout.write(j + ' ');
    }

    console.log();
  }

  // Print the lower half of the butterfly pattern
  for (let i = 1; i <= rows; i++) {
    // Print spaces
    for (let j = 1; j <= i; j++) {
      process.stdout.write('  ');
    }

    // Print numbers in decreasing order
    for (let j = rows; j >= i; j--) {
      process.stdout.write(j + ' ');
    }

    // Print numbers in decreasing order
    for (let j = rows - i; j >= 1; j--) {
      process.stdout.write(j + ' ');
    }

    console.log();
  }

  rl.close();
});
