// *****
//  ****
//   ***
//    **
//     *

n = 5

for(i=1;i<=n;i++){
    for(k=1;k<=i;k++){
        process.stdout.write(" ")
    }
    for(j=i;j<=n;j++){
        process.stdout.write("*")
    }
    console.log()
}