// *       * 
//  *     *  
//   *   *   
//    * *    
//     *     
//    * *    
//   *   *   
//  *     *  
// *       * 

n = 5
for(i = 1; i <= 2*n-1; i++) {
    if( i <= n) {
        flag = i
    } 
    else {
        flag = 2*n - i
    }
    flag1 = n
    for(k = 1; k <= flag; k++) {
        process.stdout.write(" ")
    }
    for(j = flag1; j >= flag; j--) {
        if (j == flag1 || j == flag) {
            process.stdout.write("* ")
        } else {
            process.stdout.write("  ")
        }

    }
    process.stdout.write("\n")
}

