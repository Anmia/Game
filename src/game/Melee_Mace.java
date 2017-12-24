/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author nerdi
 */
public class Melee_Mace extends Melee {
    private final static long itemID = 10006;
    private final static String name = "Mace";
    private final static int amount = 1;
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 6;
    
    private final static boolean reach = false;

    public Melee_Mace() {
        super(itemID, name, amount, twoHanded, 
                damageDice, reach);
    }
}
