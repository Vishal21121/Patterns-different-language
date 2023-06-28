const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter the number of rows: ", function(n) {
  printPattern(parseInt(n));
  rl.close();
});

function printPattern(n) {
  let num = 2;
  for (let i = 0; i < 2 * n - 1; i++) {
    if (i % (n - 1) === 0) {
      for (let j = 0; j < n; j++) {
        process.stdout.write(num + ' ');
        num += 2;
      }
      console.log();
    } else {
      console.log(num);
      num += 2;
    }
  }
}
