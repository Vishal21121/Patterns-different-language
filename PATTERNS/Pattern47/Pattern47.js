function generatePattern(input) {
    let pattern = '';
  
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
  
  // Example usage:
  const input = 4;
  const pattern = generatePattern(input);
  console.log(pattern);