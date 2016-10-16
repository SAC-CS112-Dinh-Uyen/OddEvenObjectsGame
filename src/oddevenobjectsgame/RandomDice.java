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
public class RandomDice {
    private int randomNumber;
    // Constructor
    public RandomDice()
    {
        randomNumber= 1+(int)(Math.random()*6);
        System.out.printf("Dice number is %d\n",randomNumber);
    }//end constructor
    
    //method to retrieve the random number
    public int getDiceNumber()
    {
        return randomNumber;
    }//end method
    
    
}
