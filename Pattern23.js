// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

n = 5

for(i=1;i<=2*n;i++){
    spaceCount = i<=n ? i: 2*n-i+1;
    colCount = i<=n ? n : 2*i-n-1;
    for(j=i;j<=colCount;j++){
        process.stdout.write("*")
    }
    for (col = 2; col <= spaceCount; col++) {
        process.stdout.write("  ");
    }
    for(j=i;j<=colCount;j++){
        process.stdout.write("*")
    }
    console.log()
}