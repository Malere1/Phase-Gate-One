def add_negative_numbers(array):
    array[:] = [x if x < 0 else 0 for x in array]
    return array

