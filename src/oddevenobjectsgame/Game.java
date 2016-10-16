/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevenobjectsgame;

/**
 *
 * @author uyen
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Game {
    private int i=0;
    private int userWin = 0;
    private int totalPlay=1;
    private int rollOddNum=0;
    private int rollEvenNum=0;
    private float percentageWin;
    private int[] listDice= new int[100];
    private String[] listUser=new String[100];
    private String[] listResult=new String[100];
    private Scanner input = new Scanner(System.in);
    public Game()
    {
        do
        {   
            Player myGuess = new Player();
            int guessNumber = myGuess.getOddEven();
            
            RandomDice myRandom = new RandomDice();
            int diceNumber = myRandom.getDiceNumber();
           
            listDice[i]= diceNumber;
            if(guessNumber==1)
                listUser[i]="Odd";
            else
                listUser[i]="Even";
            
            if(diceNumber%2==0)
                rollEvenNum++;
            else
                rollOddNum++;
            if(diceNumber%2==0 && guessNumber==2)
            {
                userWin ++;
                listResult[i]="Win";
                System.out.println("You win!");
            }
            else if (diceNumber%2!=0 && guessNumber==1)
            {
                userWin ++;
                System.out.println("You win!");
                listResult[i]="Win";
            }
            else
            {
                System.out.println("You lose!");
                listResult[i]="Lose";
            }
            
            System.out.println("Would you like to play again? Y/N");
            String answer = input.next(); 
            String upperCaseAnswer = answer.toUpperCase(); 
            if(upperCaseAnswer.equals("Y"))
            {
                i++;
                totalPlay ++;
            }
            else
            {             
                //create rows/columns of text representing array game history
                // int[][] aryGame = new int[totalPlay][3];
                System.out.printf("\nGame history is:%n");
                System.out.printf("                    ");
                System.out.printf("Die number     ");
                System.out.printf("User guess     ");
                System.out.printf("Result%n");
                for(int row=0; row<totalPlay;row++)
                {
                    System.out.printf("           Game %d", row +1);
                    //Out put game history
                    System.out.printf("       %d",listDice[row]);
                    System.out.printf("             %s",listUser[row]);
                    System.out.printf("          %s",listResult[row]);
                    System.out.println();
                }
                
                i=0;
            }
        }while(i!=0 && i<100);
        
        
        
    }
    public void displayMessage()
    {
        percentageWin = (float)((userWin*100)/totalPlay);
        System.out.printf("%nYou've won %d times.",userWin);
        System.out.printf("%nYou've played %d times.%n",totalPlay);
        System.out.printf("The system generate %d number of Odds and %d number of Even.%n",rollOddNum, rollEvenNum);
        System.out.printf("Your winning percentage is %s.%n",percentageWin+"%");
        System.out.println("Goodbye!");
    }
}
