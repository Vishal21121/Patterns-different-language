const readline = require('readline');

function printEightShapeSymbol() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question('Enter the value of n: ', (rows) => {
      rl.close();

      const n = parseInt(rows);
      const k = n * 2 - 1;
        
        process.stdout.write('\n');

      for (let i = 1; i <= k; i++) {
        if (i === 1 || i === n || i === k) {
          for (let j = 1; j <= n; j++) {
            if (j === 1 || j === n) {
              process.stdout.write(' ');
            } else {
              process.stdout.write('*');
            }
          }
        } else {
          for (let j = 1; j <= n; j++) {
            if (j === 1 || j === n) {
              process.stdout.write('*');
            } else {
              process.stdout.write(' ');
            }
          }
        }
        process.stdout.write('\n');
      }
    
  });
}

printEightShapeSymbol();
