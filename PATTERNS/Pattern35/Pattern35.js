const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Enter the number of rows: ", (n) => {
  for (let i = 1; i <= n; i++) {
    for (let space = n; space >= i; space--) {
      process.stdout.write(" ");
    }
    process.stdout.write("*");
    if (i === 1 || i === Number(n)) {
      for (let j = 1; j < n; j++) process.stdout.write("*");
    } else {
      for (let k = 2; k < n; k++) process.stdout.write(" ");
      process.stdout.write("*");
    }

    process.stdout.write("\n");
  }

  rl.close();
});
