//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *

n = 5
for (row = 1; row <= 2*n-1; row++) {
    Corep = row<=n ? row: 2*n-row;
    spaceChange = row <= n ? n-row+1: (row-n)+1;
    for (space = 1; space <= spaceChange; space++) {
        process.stdout.write(" ");
    }
    for (col = 1; col <= Corep; col++) {
        process.stdout.write("* ");
    }
    console.log();
}