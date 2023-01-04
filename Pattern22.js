// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *


let n = 5;

let j = 1, k = 1, i = 1;
for (i = 1; i <= (2 * n - 1); i++) {
    k = (i <= n) ? i : (2 * n - i);
    spaceChange = i <= n ? n-i+1: (i-n)+1;
    for (j = 1; j <= k; j++) {
        process.stdout.write("*");
    }
    for(space=1;space<spaceChange;space++){
        process.stdout.write("  ")
    }
    for (j = k; j >= 1; j--) {
        process.stdout.write("*");
    }
    console.log()
}