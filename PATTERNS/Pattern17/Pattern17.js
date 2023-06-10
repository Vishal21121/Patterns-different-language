    //     *
    //    * *
    //   *   *
    //  *     *
    // *********

n = 10
for(i=1;i<=n;i++){
    for(k=i;k<=n;k++){
        process.stdout.write(" ")
    }
    col = i<n ? i : 2*n-1
    for(j=1;j<=col;j++){
        if(col<2*n-1){
            if(j==1 || j==i){
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