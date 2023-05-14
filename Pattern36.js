n = 7
for (i = 1; i <= n; i++ ){
    for (j = 1; j <= n; j++) {
        if (i <= (n+1)/2) {
            if (i == 1 && (j == 1 || j >= (n+1)/2)) {
                process.stdout.write("* ");
            } else if (i > 1 && j == (n+1)/2 || j == 1) {
                process.stdout.write("* ");
            } else if(i==(n+1)/2){
                process.stdout.write("* ");
            }
            else {
                process.stdout.write("  ");
            }
        }else {
            if(i<n && (j==(n+1)/2 || j==n)){
                process.stdout.write("* ");
            }else if (i==n && (j<=(n+1)/2) || j==n){
                process.stdout.write("* ");
            }
            else{
                process.stdout.write("  ");
            }
        }
    }
    process.stdout.write("\n");
}