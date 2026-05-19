def get_prime_numbers(array):
    def is_prime(number):
        if number <= 1:
            return False
        for count in range(2, int(number ** 0.5) + 1):
            if number % count == 0:
                return False
        return True

    prime_numbers = [x for x in array if is_prime(x)]
    return sorted(prime_numbers)
