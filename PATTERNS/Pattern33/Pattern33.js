const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the input n where row = 2*n - 1:', (n) => {
    for (let i = 1; i <= 2 * n - 1; i++) {
        if(i==n){
            for(let j=0;j<2*n-1;j++){
                process.stdout.write("*");
            }
            process.stdout.write("\n");
            continue;
        }
        for (let k = 0; k <n-1; k++) {
            process.stdout.write(" ");
        }
        process.stdout.write("* ");
        process.stdout.write("\n");
    }
    rl.close();
});
