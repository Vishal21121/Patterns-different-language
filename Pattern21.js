//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1

n = 4
for (row = 1; row <= 2*n - 1; row++) {
    colCount = row <= n ? row : 2 * n - row
    spaceCount = n-colCount+1
    for(k=1;k<=spaceCount;k++){
        process.stdout.write(" ")
    }
    for(col=colCount;col>=1;col--){
        process.stdout.write(`${col}`)
    }
    for(col=2;col<=colCount;col++){
        process.stdout.write(`${col}`)
    }
    console.log()
}