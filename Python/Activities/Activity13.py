from tkinter import N


def sum(number):
    sum =0
    for num in number:
        sum += int(num)
    return sum

sum_elements = list(input("Enter a sequence of comma separated values for list1: ").split(","))
print("The sum of all elements is : ",sum(sum_elements))