def add_negative_numbers(array):
    arr[:] = [x if x < 0 else 0 for x in arr]
    return array

