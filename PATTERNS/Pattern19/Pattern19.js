    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *

n = 5

for(row=1;row<=2*n-1;row++){
    Corep = row<=n ? row: 2*n-row;
    spaceChange = row <= n ? n-row+1: (row-n)+1;
    for(k=1;k<=spaceChange;k++){
        process.stdout.write(" ");
    }
    for(col=1;col<=Corep;col++){
        if(col==1 || col == Corep){
            process.stdout.write("* ");
        }else{
            process.stdout.write("  ");
        }
    }
    console.log()
}