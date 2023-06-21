function generatePattern() {
    let pattern = '';
    let input = prompt("enter a number: ")
  
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
