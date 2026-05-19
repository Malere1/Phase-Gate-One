numbers = []
while True:
    number = input("Enter a number (enter 0 to stop): ")
    if number == '0':
        break
    numbers.append(int(number))
sum = sum(numbers)
print(f"The total is: {sum}")

