const readline = require('readline');

const r1  = readline.createInterface(process.stdin, process.stdout);

r1.setPrompt('Enter the number of rows');
r1.prompt();
r1.on('line' , (num) => {
    // upward pattern 
    for(let i =0;i<num;i++){
        let star = 2*i +1;
        let space = num-i;
        for(let j = 0;j < space;j++){
           process.stdout.write(' ');
        }
        for(let k =0;k<star;k++) {
            process.stdout.write('*');
        }
        
        console.log();
    }
    
    // downward pattern 
    for(let i =num-2 ;i>=0;i--){
        let star = 2*i +1;
        let space = num-i;
        for(let j = 0;j < space;j++){
           process.stdout.write(' ');
        }
        for(let k =0;k<star;k++) {
            process.stdout.write('*');
        }
        
        console.log();
    }
    
    r1.close();
})