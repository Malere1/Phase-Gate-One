function startGame() {
    let randomNumber = Math.floor(Math.random() * 100) + 1;
    let attempts = 0;
    let rating = "Better luck";

    while (attempts < 5) {
        let guess = prompt("Guess a number between 1 and 100:");

        if (!isNaN(guess)) {
            guess = parseInt(guess);

            attempts++;

            if (guess === randomNumber) {
                rating = "Legendary";
                break;
            } else if (attempts < 2) {
                rating = "Excellent";
            } else if (attempts <= 4) {
                rating = "Good";
            } else {
                rating = "Close!";
       } else {
            alert("Invalid input. Please enter a number.");
            attempts--; 
        }
    }

    alert("Rating: " + rating);
    if (attempts === 5) {
        alert("Sorry, you didn't guess correctly. The number was " + 
randomNumber + ".");
    }
}

startGame();

