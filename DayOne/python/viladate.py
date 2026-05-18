import random

def start_game():
    randomNumber = random.randint(1, 100)
    attempts = 0

    while attempts < 5:
        guess = input("Guess a number between 1 and 100:")

        try:
            guess = int(guess)

            if guess == randomNumber:
                print(" Congratulations! You guessed correctly.")
                break
            elif guess > randomNumber:
                print("Your guess is too high. Try again!")
            else:
                print("Your guess is too low. Try again!")

        except ValueError:
            print("Invalid input. Please enter a number.")
            attempts -= 1 

        attempts += 1

    if attempts == 5:
        print("Sorry, you didn't guess correctly. The number was", 
randomNumber)

start_game()

