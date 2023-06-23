const readline = require('readline');

function printPattern(rows) {
    let col, num = 0;

    // Loop for each row
    for (let row = 1; row <= rows; row++) {

        // When row number is odd, print in increasing order
        if (row % 2 !== 0) {

            // Printing in ascending order
            for (col = num + 1; col < num + row; col++)
                process.stdout.write(col + " ");
            console.log(col);

            // Update value of 'num'
            num = col;
        }

        // When row number is even, print in descending order
        else {

            // Update value of 'num'
            num = num + row - 1;

            // Print numbers in decreasing order
            for (col = num; col > num - row + 1; col--)
                process.stdout.write(col + " ");
            console.log(col);
        }
    }
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question("Enter the number of rows for Pascal's triangle: ", function(numRowsInput) {
    // Parse the input as an integer
    var numRows = parseInt(numRowsInput, 10);
  
    // Generate Pascal's triangle
    var pascalTriangle = printPattern(numRows);
  
    console.log(pascalTriangle);
  
    rl.close();
  });
