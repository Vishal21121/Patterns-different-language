
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


rl.question('Enter Star Dimension: ', (numero) => {
    const no = parseInt(numero);
    var rows = 1;
    const totColumns = (no * 2) - 1;
    var auxColumns = totColumns;
    starPattern(rows, no, totColumns, auxColumns);
    rl.close();
});

function starPattern(rows, no, totColumns, auxColumns) {
    while (rows <= totColumns) {
        var result = ""
        if (rows <= no) {
            var j = totColumns - no - rows + 1
            for (var i = 0; i < j; i++)
                result += " ";
            for (var i = j; i < auxColumns; i++)
                result += "*";
            console.log(result)
            auxColumns -= 2
            if (rows == no)
                auxColumns += 2
        }
        else {
            auxColumns += 2
            j = rows - no
            for (var i = 0; i < j; i++)
                result += " ";
            for (var i = j; i < auxColumns; i++)
                result += "*";
            console.log(result)
        }
        rows += 1
    }
}