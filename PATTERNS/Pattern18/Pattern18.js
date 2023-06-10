    // *********
    //  *     *
    //   *   *
    //    * *
    //     *

n = 10
for(i=1;i<=n;i++){
    for(k=1;k<=i;k++){
        process.stdout.write(" ")
    }
    col = i == 1 ? 2*n-1 : n
    for(j=i;j<=col;j++){
        if(col<2*n-1){
            if(j==i || j==n){
                process.stdout.write("* ")
            }else{
                process.stdout.write("  ")
            }
        }
        else{
            process.stdout.write("*")
        }

    }
    console.log()
}