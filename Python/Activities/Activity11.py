fruit_shop = {
    "apple":10,
    "banana":20,
    "cherry":30,
    "grapes":40}
fruit_available = input("Enter fruit you wanted to check if available: ").lower()

if fruit_available in fruit_shop:
    print(fruit_available  + " is available in the shop")
else:
    print(fruit_available  + " is not available in the shop")
       