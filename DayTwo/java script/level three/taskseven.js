const readline = require('readline');

rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter 5 numbers (separated by spaces): ", (answer) => {
    const numbers = answer.split(' ').map(Number);
    let sum = 0;
    for (let i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    console.log(`The sum of the numbers is: ${sum}`);
});

