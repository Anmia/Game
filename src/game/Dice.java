/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;



/**
 * This class is used for rolling dice, it can roll any one type of dice as many
 * times as required. 
 * 
 * NOTE: find way to allow different dice to be rolled 
 * like 2d6 + 1d4. 
 * or should this be done in the object rolling the dice?
 * @author Magnus
 */
public class Dice {
    public int rollDice(int dice, int rolls) {
        int result = 0;
        
        for (int i = 0; i < rolls; i++) {
            Random rand = new Random();
            int roll = rand.nextInt(dice);
            result = result + roll + 1;            
        }
        
        return result;
    }
    
    public int rollAdvantage(int atribute) {
        Dice dice = new Dice();
        
        int one = dice.rollDice(20, 1);
        int two = dice.rollDice(20, 1);
        
        if (one < two) {
            return two;
        } else if (one > two) {
            return one;
        } else {
            return one;
        }
    }
    
    public int rollDisAdvantage(int atribute) {
        Dice dice = new Dice();
        
        int one = dice.rollDice(20, 1);
        int two = dice.rollDice(20, 1);

        if (one > two) {
            return two;
        } else if (one < two) {
            return one;
        } else {
            return one;
        }
    }
}
