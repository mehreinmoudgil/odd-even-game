# odd-even-game
This project is a mini game of Odd and Even that I made in 9th grade. It uses the various functions of Java to create an interactive gameplay interface for the user. The game not only provides a single gameplay but also the choice to exit at any point or to replay. It keeps the necessary fallbacks in case the user gives an erroneous input.
The code provides HIGH READABILITY for convenience with added comments for better understanding.

The program begins with importing Scanner class (to accept inputs from player at runtime) and Random class (to generate random no.s as per the requirements of the game.)
We begin with creating user-defined methods that enable the user to exit the game at any point of runtime by checking if the input is the command for exit or the integer/string required to continue the game.
The game begins by asking the player his/her choice between odd and even (or eve as mentioned in the code) for the toss
Next, if the player wins the toss, it gives the option to choose between batting and balling. Elsewise, the computer chooses batting for itself.
The game continues with subsequent rounds of batting and balling. The computer keeps a track of the batter's score. When the batter gets out (player or computer itself), it gives a target of score+1 (cscore for computer's score) to the next batter.
The batting is over when the baller and batter throw the same number.
At the end, the player is given an option to continue playing or exit the game.
A user-defined method is created to check the input of the player and perform the functions desired by the player, from the above two choices.
