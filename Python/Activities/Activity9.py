list1 = list(input("Enter a sequence of comma separated values for list1: ").split(","))
list2 = list(input("Enter a sequence of comma separated values for list2: ").split(","))
list3 = list()
for y in list1:
    if((int(y) % 2) != 0):
        list3.append(y)
for x in list2:
    if ((int(x)%2) == 0):
        list3.append(x)
print("list1 : ",list1)
print("list2 : ",list2)
print("list3 : ",list3)
