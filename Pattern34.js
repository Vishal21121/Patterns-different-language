const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the row number:", n => {
    for (let i = 1; i < 2 * n; i++) {
        for (let k = 2 * n - 1; k >= i; k--) {
            process.stdout.write("  ");
        }
        for (let j = 1; j <= i; j++) {
            if (j === 1 || j === i) {
                process.stdout.write("* ");
            } else if (i === 2 * n - 1) {
                process.stdout.write("* ");
            } else {
                process.stdout.write("  ");
            }
        }
        process.stdout.write("\n");
    }

    rl.close();
});