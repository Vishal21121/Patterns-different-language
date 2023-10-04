// 1  2  3  4  5  
// 2  3  4  5
// 3  4  5
// 4  5
// 5

let n = 5

for (i = 1; i <= n; i++) {
    for (j = i; j <= n; j++) {
        process.stdout.write(j+ " ")
    }
    console.log()
}