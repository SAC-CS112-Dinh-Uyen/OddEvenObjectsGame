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
public class Player {
    private int guess; // user name for this user       
    private Scanner input;
    
    //Constructor
    public Player()
    {   
        input = new Scanner(System.in);
        System.out.println("Enter a guess number with 1 for Odd, 2 for Even:");
        guess = input.nextInt();
        if(guess==1)
            System.out.println("You guess odd");
        else if(guess==2)
            System.out.println("You guess even");
        else
        {
            System.out.println("You should choose 1 for Odd or 2 for Even!");
            System.exit(0);
        }
    }// End constructor
    
    // Method to retrieve the guess number 1 for Odd or 2 for Even
    public int getOddEven()
    {
        return guess;
    } // end method getOddEven
}   
 
