onst num = parseInt(prompt("Enter a number: "));
let factorial = 1;
for (let count = 1; count <= num; count++) {
    factorial *= count;
}
console.log(`The factorial of ${num} is ${factorial}`);

