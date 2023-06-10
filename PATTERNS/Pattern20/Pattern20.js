    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

n = 5
for (i = 1; i <=n; i++) {
    for(k = i;k<=n;k++){
        process.stdout.write("  ");
    }
    for(j = i;j>=1;j--){
        process.stdout.write(j+ " ");
    }
    for(p = 2;p<=i;p++){
        process.stdout.write(p+ " ");
    }
    console.log()
}
