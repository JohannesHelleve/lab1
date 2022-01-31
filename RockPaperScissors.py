from random import choice

round_number = 1
human_score = 0
computer_score = 0
choices = ("rock", "paper", "scissors")
#sdfsddsfasdfsd

def random_choice():
    '''
    Chooses random out of rock paper scissors
    :return: random choice
    '''
    return choice(choices)

def is_winner(choice1, choice2):
    '''
    Check if choice1 is wins over choice2
    :param choice1:
    :param choice2:
    :return: true if choice1 beats choice2, false if not
    '''
    if choice1 == "paper":
        return choice2 == "rock"
    elif choice1 == "scissors":
        return choice2 == "paper"
    else:
        return choice2 == "scissors"


def user_choice():
    '''
    Prompt the user with what choice of rock paper scissors they choose
    :return: "rock", "paper" or "scissors"
    '''
    while True:
        human_choice = input("Your choice (Rock/Paper/Scissors)?").lower()
        if validate_input(human_choice, choices):
            return human_choice
        else:
            print(f"I don't understand {human_choice}. Try again")


def continue_playing():
    '''
    Prompt the user if they want to continue playing.
    :return: "y" or "no"
    '''
    while True:
        continue_answer = input("Continue (y/n)?").lower()
        if validate_input(continue_answer, ["y", "n"]):
            return continue_answer
        else:
            print(f"I don't understand {continue_answer}. Try again")


def validate_input(input, valid_input):
    '''
    Checks if the given input is either rock, paper or scissors.
    :param input: user input string
    :param valid_input: list of valid input strings
    :return: true if valid input, false if not
    '''
    input = input.lower()
    return input in valid_input

# Game loop
while True:
    print(f"\nLet's play round {round_number}")
    #Humand and Computer choice
    human_choice = user_choice()
    computer_choice = random_choice()
    choice_string = f"Human chose {human_choice}, computer chose {computer_choice}."

    # Check who won
    if is_winner(human_choice, computer_choice):
        print(choice_string + " Human wins.")
        human_score += 1
    elif is_winner(computer_choice, human_choice):
        print(choice_string + " Computer wins.")
        computer_score += 1
    else:
        print(choice_string + " It's a tie")
    print(f"Score: me {computer_score}, you {human_score}")

    # Ask if human wants to play again
    continue_answer = continue_playing()
    if continue_answer == "n":
        break

print("Bye bye :)")
