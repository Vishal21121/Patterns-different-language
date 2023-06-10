function generatePattern(n) {
  var pattern = '';

  for (var i = 0; i < n; i++) {
    for (var j = 0; j < n; j++) {
      if ((i + j) % 2 === 0) {
        pattern += '1';
      } else {
        pattern += '0';
      }
    }
    pattern += '\n';
  }

  return pattern;
}

var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the number of rows: ', function(n) {
  
    var pattern = generatePattern(parseInt(n));
    console.log(pattern);
    rl.close();
  
});
