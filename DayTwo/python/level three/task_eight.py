numbers = input("Enter 5 numbers (separated by spaces): ")
numbers = list(map(int, numbers.split()))
sum = sum(numbers)
print("The sum of the numbers is:", sum)
