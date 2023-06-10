const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question('enter a number : ', function(inputNumber){
    printPattern38(inputNumber);
    rl.close();
});

//Pattern logic
function printPattern38(n){
    n *= 2;
    for(let i = 0; i < n; i++){
        let line = "";
        for(let j = 0; j < n; j++){
            if(j === 0 || j === i || j === n - i - 1 || j === n - 1){
                line += "*";
            }else{
                line += " ";
            }
        }
        console.log(line);
    }
}