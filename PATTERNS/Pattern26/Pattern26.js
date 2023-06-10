// 1      1
// 12    21
// 123  321
// 12344321

n = 5
for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        process.stdout.write(`${j}`)
    }
    for(k=i;k<=n-1;k++){
        process.stdout.write(`  `)
    }
    for(j=i;j>=1;j--){
        process.stdout.write(`${j}`)
    }
    console.log()
}