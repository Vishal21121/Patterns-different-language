const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the input n where row = 2*n - 1:', (n) => {
  for (let i = 1; i <= 2 * n - 1; i++) {
    let flag;
    if (i <= n) {
      flag = i;
    } else {
      flag = 2 * n - i;
    }
    let flag1 = n;
    for (let k = flag1; k >= 1; k--) {
      process.stdout.write(" ");
    }
    for (let j = flag1; j >= flag; j--) {
      if (j === flag1 || j === flag) {
        process.stdout.write("* ");
      } else {
        process.stdout.write("  ");
      }
    }
    process.stdout.write("\n");
  }
  rl.close();
});
