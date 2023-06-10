// E D C B A
// D C B A
// C B A
// B A
// A

n = 5
val = 64+n;
for(i=1;i<=n;i++){
    printable = val;
    for(j=i;j<=n;j++){
        process.stdout.write(`${String.fromCharCode(printable--)} `);
    }
    val--;
    process.stdout.write("\n");
}