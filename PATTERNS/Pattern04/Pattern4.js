// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
let n = 5;
for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        process.stdout.write(j+ " ");
    }
    console.log();
}

