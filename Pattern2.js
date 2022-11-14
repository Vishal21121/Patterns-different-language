//      *
//     *  *
//    * *  * 
//  *  *  *  *
// *  *  *  *  *


let n = 5;

for(i =1 ;i<=n;i++){
    for(k=i;k<=n;k++){
        process.stdout.write(" ")
    }

    for(j=1;j<=i;j++){
        process.stdout.write("* ")
    }
    console.log()
    
}