function generatePattern() {
    let pattern = '';
    // let input = prompt("enter a number: ");

    //adding an example number since the prompt function isn't working

    let input = 7;
  
    for (let i = input; i >= 1; i--) {
      for (let j = input; j >= 1; j--) {
        if (j === i) {
          pattern += '*';
        } else {
          pattern += j;
        }
      }
      pattern += '\n';
    }
  
    return pattern;
  }
  console.log(generatePattern());
