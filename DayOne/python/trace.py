import random

def start_game():
    randomNumber = random.randint(1, 100)
    attempts = 0
    rating = "Better luck"

while attempts < 5:
 guess = input("Guess a number between 1 and 100:")
            try:
   guess = int(guess)
     attempts += 1
if guess == randomNumber:
 rating = "Legendary"
    break
elif attempts < 2:
  rating = "Excellent"
 elif attempts <= 4:
  rating = "Good"
    else:
 rating = "Close!"
 except ValueError:
            print("Invalid input. Please enter a number.")
           
    print("Rating: ", rating)
    if attempts == 5:
        print("Sorry, you didn't guess correctly. The number was", randomNumber)

start_game()

