# Introduction to Java
In this lab we will implement a program using INF100 concepts, but in Java syntax.

## Rock Paper Scissors
The well know game of Rock Paper Scissors was an exam question in [INF100 spring 2020](https://mitt.uib.no/courses/29690/files/3490285/download?wrap=1) (task 14). In this lab we will be implementing the very same program (with a de-emphasis on error/exception handling), but instead of the more familiar Python language we will be using Java.

The aim of this lab is to teach you Java syntax. If you do not remember all programming concepts from INF100 and need a refresher we have implemented [Rock Paper Scissors in Python](https://git.app.uib.no/ii/inf101/22v/tutors/lab1/-/blob/master/RockPaperScissors.py).

### Task
Write a Java program where a human plays against the computer. The human should write their choice of rock, paper or scissors in the console, while the computer should select randomly between the three choices. The human should be prompted with whether they want to continue playing after each round. All input from the human should be validated, disallowing any crashes of the program (see round 3).

Clone this project and use the existing code in RockPaperScissors.java to implement the game. 

**IMPORTANT**: The exiting code must be left as is. To get input from the user use ``readInput``.

The program should print the following in the console:
```
Let's play round 1
Your choice (Rock/Paper/Scissors)?
rock
Human chose Rock, computer chose Paper. Computer wins!
Score: human 0, computer 1
Do you wish to continue playing? (y/n)?
y
Let's play round 2
Your choice (Rock/Paper/Scissors)?
paper
Human chose Paper, computer chose Scissors. Computer wins!
Score: human 0, computer 2
Do you wish to continue playing? (y/n)?
y
Let's play round 3
Your choice (Rock/Paper/Scissors)?
cardboard
I do not understand cardboard. Could you try again?
Your choice (Rock/Paper/Scissors)?
scissors
Human chose Scissors, computer chose Paper. Human wins!
Score: human 1, computer 2
Do you wish to continue playing? (y/n)?
n
Bye bye :)
```

### Pass
To pass this exercise the JUnit tests must all be green. These tests check if the input and output text is **exactly** as showed in the example (with varying input of course). When you have passed the tests you must hand in via CodeGrade (found on MittUiB).
