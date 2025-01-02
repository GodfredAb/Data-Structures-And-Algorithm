def binary_search(list, target):
    first_index = 0
    last_index = len(list) - 1

    while first_index <= last_index:
        current_index = (first_index + last_index) // 2

        if list[current_index] == target:
            return current_index
        elif list[current_index] < target:
            first_index = current_index + 1
        else:
            last_index = current_index - 1
    return None


def verify_search(index):
    if index is not None:
        print('Item found at index: ', index)
    else:
        print('Item not found')



