function generatePattern(input) {
    let pattern = '';
    // let input = prompt("enter a number: ");

    //adding an example number since the prompt function isn't working
  
    for (let i = 1; i<=input; i++) {
      for (let j = input; j>=1; j--) {
        if (j === i) {
          pattern += '*';
        } else {
          pattern += j;
        }
      }
      pattern += '\n';
    }
  
    return pattern;
  }


//readline is an object, we use the built in require function in js to fetch the readline module

var readline = require('readline'); 
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('pick a number ', (n) => {
  
    var pattern = generatePattern(parseInt(n));
    console.log(pattern);
    rl.close();
  
});

