/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Magnus
 */
public class Melee_Club extends Melee {
    private final static long itemID = 10001;
    private final static String name = "Club";
    private final static int amount = 1;
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 4;
    
    private final static boolean reach = false;

    public Melee_Club() {
        super(itemID, name, amount, twoHanded, 
                damageDice, reach);
    }
}
