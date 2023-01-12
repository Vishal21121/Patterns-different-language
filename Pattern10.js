// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F

n = 6
val = 64
for (i = 1; i <=n; i++) {
    for(j=1;j<=i;j++){
        process.stdout.write(`${String.fromCharCode(val+j)} `);
    }
    process.stdout.write("\n");
}