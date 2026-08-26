import java.util.Scanner; import java.util.Random;
class odd_eve
{
    public static Scanner s = new Scanner (System.in); public static String replay; // String replay used later to restart the game
    public static int getIntOrExit() //method to check if the user wants to keep playing or exit 
    {
        String input = s.next();
        if (input.equalsIgnoreCase ("E"))
        {
            System.out.println ("Exiting via E command. Goodbye!"); 
            System.exit(0); //allows the user to exit at any point of runtime
        }
        try {
            return Integer.parseInt(input);} //if the user didn't want to exit and gave an integer as per the game requirements
        catch (NumberFormatException e)
        {
            System.out.println("Invalid number format! Defaulting to 0.");
            return 0;
        }
    }
    public static String getStringOrExit() // method for exit when compiler expects a string
    {
    String input = s.next(); 
    if (input.equalsIgnoreCase("E")) {
        System.out.println("Exiting program via E command. Goodbye!");
        System.exit(0);
    }
    return input;
}
    public static void main()
    {
        System.out.println("INSTRUCTIONS : Odd eve is a game where two players go turnwise batting and balling.\n The game proceeds with the batter trying to score runs while making no.s with his hand whereas the baller tries to outrun the batter by trying to match the no.s that the batter throws.\n The catch is that both the batter and baller make the no.s with their hand at the same time in a physical game.\n Here, however, since the machine is not programmed to change its answers based on yours, it's alright if you go first. \n You can only opt for no.s from 1-6. \n Type E if you want to terminate the game at any point.");
        Random rand = new Random ();
        do
        {System.out.println ("Enter odd or eve"); 
        String choice = getStringOrExit(); 
        if ( choice.equalsIgnoreCase("odd"))
        {
        System.out.println ("You chose odd, the computer chooses Eve \n Enter the no. for toss");
        int tossu = getIntOrExit();
        int tossc = rand.nextInt(6) +1;
        int tossr = tossu + tossc;
        System.out.println ("The computer chose " + tossc + "\n The sum is " + tossr);
        if ( tossr %2 != 0)
        {
            System.out.println (" Yay, you won the toss \n Enter batting or balling");
            String start = getStringOrExit();
            if (start.equalsIgnoreCase("batting"))
            {
                System.out.println ("You chose batting. The game begins. Enter the desired no.s");
                int game = getIntOrExit();
                int response = rand.nextInt(6) + 1; int score = 0;
                while ( game != response)

                {
                    score =  score + game;
                    System.out.println ("Computer chooses " + response);
                    System.out.println ("Current score = " + score);
                    game = getIntOrExit();
                    response = rand.nextInt(6) + 1; //generates a random number between 1-6 for the computer's turn
                }
                if ( game == response)
                {
                    System.out.println ("OUT. Computer's target = " + (score+1));
                    System.out.println ("Your balling begins. Enter your no.s");
                    int regame = getIntOrExit(); int reply = rand.nextInt(6) + 1; int cscore = 0;
                    while (regame != reply) // for the user to complete the game by batting after balling or vice versa
                    {
                       cscore = cscore + reply;
                       System.out.println ("Computer chose " + reply);
                       System.out.println ("Computer's current score = " +cscore); 
                       regame = getIntOrExit();
                       reply = rand.nextInt(6)+ 1;
                    }
                    if (regame == reply) 
                    {
                        System.out.println ("Game Over");
                        if (score >= cscore)
                        {
                            System.out.println (" Congratulations! YOU WON");
                        }
                        else { System.out.println ("Sorry, you lost. Computer Wins");
                    }
                }
            }
        }
             else if (start.equalsIgnoreCase("balling"))
            {
                System.out.println ("You chose balling. The game begins. Enter your no.s");
                int  game = getIntOrExit();
                 int response = rand.nextInt(6) + 1; int cscore = 0;
                while ( game != response)
                {
                    cscore = cscore + response;
                    System.out.println ("Computer chooses " + response);
                    System.out.println ("Current Computer Score = " + cscore);
                    game = getIntOrExit();
                    response = rand.nextInt(6) + 1;
                }
                if ( game == response)
                {
                    System.out.println ("YAYY! Computer's Out. Your target = " + (cscore+1) + " Your Batting begins. Enter your no.s");
                    int regame = getIntOrExit(); int reply = rand.nextInt(6) + 1; int score = 0;
                    while ( regame != reply )

                {
                    score =  score + regame;
                    System.out.println ("Computer chooses " + reply);
                    System.out.println ("Current score = " + score);
                    regame = getIntOrExit();
                    reply = rand.nextInt(6) + 1;
                }
                if ( regame == reply)
                {
                    System.out.println ("Game Over");
                    if ( score > cscore)
                    {
                        System.out.println ("Congratulations! YOU WON");
                    }
                    else {System.out.println ("Sorry, you lost. Computer won");
                }
                }
                
            }
            
        }
    }
        else 
        { 
            System.out.println ("You lost the toss. Computer chooses balling. Enter your no. and start the game");
            int game = getIntOrExit();
                int response = rand.nextInt(6) + 1; int score = 0;
                while ( game != response)

                {
                    score =  score + game;
                    System.out.println ("Computer chooses " + response);
                    System.out.println ("Current score = " + score);
                    game = getIntOrExit();
                    response = rand.nextInt(6) + 1;
                }
                if ( game == response)
                {
                    System.out.println ("OUT. Computer's target =" + (score+1));
                    System.out.println ("Your balling begins now. Enter the no.s");
                    int regame = getIntOrExit(); int reply = rand.nextInt(6)+ 1; int cscore = 0;
                    while (regame!=reply){
                        cscore = cscore + reply;
                        System.out.println ("The computer chose " + reply+ "\n Current Computer Score = " +cscore);
                        regame = getIntOrExit();
                        reply = rand.nextInt(6) + 1;
                    }
                    if ( regame == reply)
                    {
                        System.out.println ("Game Over");
                        if ( score >= cscore)
                        {
                            System.out.println ("Congratulations! You Won");
                        }
                        else 
                        {
                            System.out.println ("Sorry, you lost. Computer wins");
                        }
                    }
                    
                }
            }
        }
    
       else if (choice.equalsIgnoreCase("eve"))
      {
         System.out.println ("You chose Eve, the computer chooses Odd \n Enter the no. for toss");
        int tossu = getIntOrExit();
        int tossc = rand.nextInt(6) +1;
        int tossr = tossu + tossc;
        System.out.println ("The computer chose" + tossc + "\n The sum is " + tossr);
        if ( tossr %2 == 0)
        {
            System.out.println (" Yay, you won the toss \n Enter batting or balling");
            String start = getStringOrExit();
            if (start.equalsIgnoreCase("batting"))
            {
                System.out.println ("You chose batting. The game begins. Enter the desired no.s");
                int game = getIntOrExit();
                int response = rand.nextInt(6) + 1; int score = 0;
                while ( game != response)

                {
                    score =  score + game;
                    System.out.println ("Computer chooses " + response);
                    System.out.println ("Current score = \t" + score);
                    game = getIntOrExit();
                    response = rand.nextInt(6) + 1;
                }
                if ( game == response)
                {
                    System.out.println ("OUT. Computer's target = " + (score+1));
                    System.out.println ("Your balling begins now. Enter the no.s");
                    int regame = getIntOrExit(); int reply = rand.nextInt(6)+ 1; int cscore = 0;
                    while (regame!=reply){
                        cscore = cscore + reply;
                        System.out.println ("The computer chose " + reply+ "\n Current Computer Score = " +cscore);
                        regame = getIntOrExit();
                        reply = rand.nextInt(6) + 1;
                    }
                    if ( regame == reply)
                    {
                        System.out.println ("Game Over");
                        if ( score >= cscore)
                        {
                            System.out.println ("Congratulations! You Won");
                        }
                        else 
                        {
                            System.out.println ("Sorry, you lost. Computer wins");
                        }
                    }
                    
                }
            }
            else if (start.equalsIgnoreCase("balling"))
            {
                System.out.println ("You chose balling. The game begins. Enter your no.s");
                 int game = getIntOrExit();
                int response = rand.nextInt(6) + 1; int cscore = 0;
                while ( game != response)
                {
                    cscore = cscore + response;
                    System.out.println ("Computer chooses " + response);
                    System.out.println ("Current Computer Score = " + cscore);
                    game = getIntOrExit();
                    response = rand.nextInt(6) +1;
                }
                if ( game == response)
                {
                    System.out.println ("YAYY! Computer's Out. Your target = " + (cscore+1) + " Your Batting begins. Enter your no.s");
                    int regame = getIntOrExit(); int reply = rand.nextInt(6) + 1; int score = 0;
                    while ( regame != reply )

                {
                    score =  score + regame;
                    System.out.println ("Computer chooses " + reply);
                    System.out.println ("Current score = " + score);
                    regame = getIntOrExit();
                    reply = rand.nextInt(6) + 1;
                }
                if ( regame == reply)
                {
                    System.out.println ("Game Over");
                    if ( score > cscore)
                    {
                        System.out.println ("Congratulations! YOU WON");
                    }
                    else {System.out.println ("Sorry, you lost. Computer won");
                }
                }
                
            }
            
            
        }
    }
        else 
        { 
            System.out.println ("You lost the toss. Computer chooses balling. Enter your no. and start the game");
            int game = getIntOrExit();
                int response = rand.nextInt(6) + 1; int score = 0;
                while ( game != response)

                {
                    score =  score + game;
                    System.out.println ("Computer chooses " + response);
                    System.out.println ("Current score = " + score);
                    game = getIntOrExit();
                    response = rand.nextInt(6) + 1;
                }
                if ( game == response)
                {
                    System.out.println ("OUT. Computer's target =" + (score+1));
                    System.out.println ("Your balling begins. Enter the no.s on your turn.");
                    int regame = getIntOrExit(); int reply = rand.nextInt(6) +1; int cscore=0;
                    while (regame != reply)
                    {
                       cscore = cscore + reply;
                       System.out.println ("Computer chooses " + reply);
                    System.out.println ("Current Computer score = " + cscore);
                    regame = getIntOrExit();
                    reply = rand.nextInt(6) + 1;
                    }
                    if (regame == reply)
                    {
                        System.out.println ("Game Over");
                        if (score >= cscore)
                        {System.out.println ("Congratulations! YOU WON");
                    }
                    else { System.out.println ("Sorry, you lose. Computer Wins");
                }
            
    }
}
}
}
System.out.println ("Enter R to replay. E to exit."); //gives user choice to restart or exit
replay = getStringOrExit();
if (replay.equalsIgnoreCase ("R") == false) 
replay = fallback();
}
while (replay.equalsIgnoreCase("R"));
}
public static String fallback() //method if user gives an erroneous input instead of E or R
{
 System.out.println ("Error in input. Defaulting to replay"); String r = "R";
    return r ;
}
}
