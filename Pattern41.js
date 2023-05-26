function printPattern41(n) {

    for(let i=1; i<=n; i++) {
        for(let j=i; j<=n; j++){
            process.stdout.write(j.toString());
            process.stdout.write(" ");
        }

        process.stdout.write("\n");  

       if(i == n)
            break;

       for(let k=1; k<=i; k++)
        process.stdout.write(" ");
    }
    
    for(let i=1; i<=n-2; i++)
        process.stdout.write(" ");

    for(let i=1; i<n; i++) {
        for(let j=n-i; j<=n; j++){
            process.stdout.write(j.toString());
            process.stdout.write(" ");
        }

        process.stdout.write("\n");  
        
       for(let k=1; k<n-i-1; k++)
            process.stdout.write(" ");
    }
  }
  
  const readline = require('readline');

  const rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout,
  });
  
  rl.question('enter a number : ', function(inputNumber){
      printPattern41(inputNumber);
      rl.close();
  });
  