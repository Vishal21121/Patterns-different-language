//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

let n = 5;

for(i=1;i<=2*n;i++){
     flag = i<=n?i:2*n-i+1;
     flag1 = n;
    for( k =1;k<=flag;k++){
       process.stdout.write(" ")
    }
    for(j=flag1;j>=flag;j--){
        process.stdout.write("* ");
    }
    console.log()
    
}