player1 = input("Enter player1 name: ")
player2 = input("Enter player2 name: ")
player1choice = input("What do you want Rock - Paper - Scissors :").lower()
player2choice = input("What do you want Rock - Paper - Scissors :").lower()
if player1choice == player2choice:
    print("It's a tie!")
elif player1choice == 'rock':
    if player2choice == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif player1choice == 'scissors':
    if player2choice == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif player1choice == 'paper':
    if player2choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")