// 4 4 4 4 4 4 4  
// 4 3 3 3 3 3 4   
// 4 3 2 2 2 3 4   
// 4 3 2 1 2 3 4   
// 4 3 2 2 2 3 4   
// 4 3 3 3 3 3 4   
// 4 4 4 4 4 4 4 

n = 4
for(i=0;i<2*n-1;i++){
    for(j=0;j<2*n-1;j++){
        val = n-(Math.min(j,2*(n-1)-j,i,2*(n-1)-i))
        process.stdout.write(`${val} `)
    }
    console.log()
}