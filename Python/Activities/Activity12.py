from tkinter import N


def calculateSum(num):
    if(num<=0):
        return num
    else:
        return num+calculateSum(num-1)

number =int( input("Enter the number : "))
print(calculateSum(number))
