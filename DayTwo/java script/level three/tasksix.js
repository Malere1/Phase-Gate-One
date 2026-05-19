const readline = require('readline');

rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout});

rl.question("Enter a number: ", (answer) => {
  const n = parseInt(answer);
  let sum = 0;
  for (let i = 1; i <= n; i++) {
    sum += i;
  }
  console.log(`The sum of numbers from 1 to ${n} is: ${sum}`);
});

