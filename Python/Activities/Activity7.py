	
number = list(input("Enter a sequence of comma separated values: ").split(","))
sum = 0
for y in number:
    sum += int(y)
print("The sum of given numbers is ",sum)
