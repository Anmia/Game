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
public class Melee_Longsword extends Melee {
    private final static int itemID = 11036;
    private final static String name = "Longsword";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 8;
    
    private final static boolean reach = false;
    private static final char damageType = 's';

    public Melee_Longsword() {
        super(itemID, name, twoHanded, damageDice, reach, damageType);
    }
}