const readline = require('readline');

var generate = function(numRows) {
  var result = [];

  if (numRows == 0)
    return result;

  result.push([1]);

  for (var i = 1; i < numRows; i++) {
    let list = [];
    list.push(1);
    for (var j = 1; j < result[i - 1].length; j++) {
      let sum = result[i - 1][j - 1] + result[i - 1][j];
      list.push(sum);
    }
    list.push(1);
    result.push([...list]);
  }

  // Format the triangle as a string
  var triangleString = '';
  var maxWidth = numRows * 2 - 1; // Maximum width of the triangle
  for (var i = 0; i < numRows; i++) {
    var row = '';
    var numSpaces = Math.floor((maxWidth - (i * 2 + 1)) / 2);
    row += ' '.repeat(numSpaces);
    for (var j = 0; j <= i; j++) {
      row += result[i][j] + ' ';
    }
    triangleString += row.trim() + '\n';
  }

  return triangleString;
};

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter the number of rows for Pascal's triangle: ", function(numRowsInput) {
  // Parse the input as an integer
  var numRows = parseInt(numRowsInput, 10);

  // Generate Pascal's triangle
  var pascalTriangle = generate(numRows);

  console.log(pascalTriangle);

  rl.close();
});
