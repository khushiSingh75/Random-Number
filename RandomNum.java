import java.util.Scanner;
import java.util.Random;
public class RandomNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random num=new Random();
        int totalScore=0;
        System.out.println("Welcome to the random number generator game..");
        boolean playAgain=true;
        while(playAgain){
            int attempts=0;
            int targetNumber=num.nextInt(100)+1;
            while(true){
                System.out.print("Guess the number(1-100)- ");
                int Guess=sc.nextInt();
                attempts++;
            
                if(Guess==targetNumber){
                    System.out.println("Your guessed number is correct" );
                    System.out.println("Number of attempts " +attempts);
                    totalScore++;
                    break;
                } 
                else if(Guess<targetNumber){
                    System.out.println("Too low, Please Try again..");
                }
                    else{
                        System.out.println("Too high, Please Try again..");
                    }
                }
                System.out.println("Do you want to playAgain...(Yes or No)");
                String userResponse=sc.next();
                playAgain=userResponse.equalsIgnoreCase("Yes");
            }
            System.out.println("Score obtained by user: " +totalScore);
            sc.close();
        }
    }
    //  This is a simple random number guessing game where the user has to guess a number between 1 and 100. The program generates a random number and the user has to guess it. The program gives feedback on whether the guess is too high or too low, and keeps track of the number of attempts. The user can play multiple rounds and the total score is displayed at the end.

