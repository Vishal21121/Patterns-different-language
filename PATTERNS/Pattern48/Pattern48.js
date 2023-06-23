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

