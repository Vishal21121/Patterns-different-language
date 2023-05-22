function aPattern(n) {
  for (let i = 1; i <= 2*n - 3; i++) {
    for (let j = 1; j <= n - i; j++) {
      process.stdout.write(" ");
    }

    if (i === 1) {
      console.log("*");
    } else if (i === n) {
      for (let k = 1; k <= n; k++) {
        process.stdout.write("* ");
      }
      console.log();
    } else if (i > n) {
      for (let k = 1; k <= 2 * n - 3; k++) {
        if (k === 1 || k === 2 * n - 3) {
          process.stdout.write("* ");
        } else {
          process.stdout.write("  ");
        }
      }
      console.log();
    } else {
      process.stdout.write("*");
      for (let k = 1; k <= 2 * i - 3; k++) {
        process.stdout.write(" ");
      }
      console.log("*");
    }
  }
}

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Enter the value of n: ", (n) => {
  aPattern(parseInt(n));
  rl.close();
});
