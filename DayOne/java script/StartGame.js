function startGame() {
let randomNumber = Math.floor(Math.random^[[B() * 100) + 1;
let attempts = 0;
while (attempts < 5) {
let guess = parseInt(prompt("Guess a number between 1 and 100:"));
if (guess === randomNumber) {
alert(" Congratulations! You guessed correctly.");
       break;
} else if (guess > randomNumber) {
alert("Your guess is too high. Try again!");
   } else {
   alert("Your guess is too low. Try again!");
        }
        attempts++;
    }
if (attempts === 5) {
alert("Sorry, you didn't guess correctly. The number was " + 
randomNumber + ".");
    }
}

