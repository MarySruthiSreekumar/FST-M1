tuple_number = tuple(input("Enter a sequence of comma separated values for list1: ").split(","))
for x in tuple_number:
    if ((int(x) % 5 ) ==0):
        print(x)