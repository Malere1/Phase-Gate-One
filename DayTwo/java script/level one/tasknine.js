const readline = require('readline');

rl = readline.createInterface({
  input: process.stdin,
  output: process.stdou});

rl.question('Enter the price of the item: ', (price) => {
  const tax = parseFloat(price) * 0.10;
  const total = parseFloat(price) + tax;

  console.log(`Tax: ${tax}`);
  console.log(`Total: ${total}`);
});

