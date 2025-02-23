def bubble_sort(list):
    for i in range(len(list) - 1):
        for j in range(len(list) - i - 1):
            if list[j] > list[j + 1]:
                list[j], list[j + 1] = list[j + 1], list[j]
    return list


numbers = [ 77, 99, 22, 33, 88, 88, 44, 66, 55 ]
print(numbers)


print(bubble_sort(numbers))