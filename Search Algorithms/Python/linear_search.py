def linear_search(list, target):
    for i in range(0, len(list)):
        if list[i] == target:
            return i
    return None

def verify_search(index):
    if index is not None:
        print('Item found at index: ', index)
    else:
        print('Item not found')

