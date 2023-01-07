// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

n = 10
for(i=1;i<=n;i++){
    start = i%2==0 ? 0 : 1
    for(j=1;j<=i;j++){
        process.stdout.write(`${start} `)
        start = start==1?0:1
    }
    console.log()
}