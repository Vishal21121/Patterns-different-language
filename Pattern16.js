    // *********
    //  *******
    //   *****
    //    ***
    //     *

n = 5
for(i=1;i<=n;i++){
    for(k=1;k<=i;k++){
        process.stdout.write(" ")
    }
    for(j=1;j<=2*(n-i)+1;j++){
        process.stdout.write("*")
    }
    console.log()
    
}