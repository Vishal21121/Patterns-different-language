const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the number of rows: ', (n) => {
    let num = 1
    for (i = 1; i <= n; i++) {
        for (k = i; k <= n; k++) {
            process.stdout.write("  ")
        }
        for (j = 1; j <= i; j++) {
            num += 1
            while (!primeNum(num)) {
                num += 1
            }
            process.stdout.write(` ${num} `)
        }
        process.stdout.write("\n")
    }
    rl.close();
});

function primeNum(val) {
    let num = 2
    if (val < num) {
        return false
    }
    while (num * num <= val) {
        if (val % num == 0) {
            return false
        }
        num += 1
    }
    return true
}