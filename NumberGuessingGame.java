import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        Random r1 = new Random();
        System.out.println("\nWelcome to number Guessing game!");
        int Score=0;
        boolean playAgain=true;
        while(playAgain)
        {
            int Targetno=r1.nextInt(100)+1;
            int attempts=0;
            int maxattempts=5;
            System.out.println("I am selected a number between 1 and 100.Can you guess it?");
            while(attempts<maxattempts)
            {
                System.out.println("\nEnter your Guess:");
                int userGuess=s1.nextInt();
                s1.nextLine();
                attempts++;
                if(userGuess==Targetno)
                {
                    System.out.println("\nCongartulations you guessed the number "+Targetno+" in "+attempts+" attempts.");
                    Score++;
                    break;
                }
                else if(userGuess<Targetno)
                {
                    System.out.println("\nThe number you have entered is low.Try again.");
                }
                else
                {
                    System.out.println("\nThe number you have entered is high.Try again.");
                }
            }
            if(attempts>=maxattempts)
            {
                System.out.println("\nSorry,you've run out of attemps.The correct number was "+Targetno+".");
            }
            System.out.println("\nDo you want to play again?(y/n): ");
            String playAgainIn =s1.nextLine();
            playAgainIn.equalsIgnoreCase("y");
       }
       System.out.println("\nGame over!Your score:"+Score);
        
    }
}