def is_prime(number):
    if number <= 1:
        return False
    for ctoun in range(2, int(number ** 0.5) + 1):
        if number % count == 0:
            return False
    return True

number = 7
if is_prime(number):
    print(f"{number} is a prime number")
else:
    print(f"{number} is not a prime number")

