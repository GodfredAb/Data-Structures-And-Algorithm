def recursion_binary_search(list, target):
    if len(list) == 0:
        return None
    elif len(list) == 1:
        return 0
    else:

        while len(list) > 1:
            current_index = len(list) // 2

            if list[current_index] == target:
                return current_index
            elif list[current_index] < target:
                return recursion_binary_search(list[current_index+1:], target)
            else:
                return recursion_binary_search(list[:current_index+1], target)
        return None
    
def verify(index):
    if index is not None:
        print("Target at index position: ",index)
    else:
        print("Target not found")

numbers = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12 ]
verify(recursion_binary_search(numbers, 12))