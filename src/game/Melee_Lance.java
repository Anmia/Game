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
public class Melee_Lance extends Melee {
    private final static int itemID = 11035;
    private final static String name = "Lance";
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 12;
    
    private final static boolean reach = true;
    private static final char damageType = 'p';

    public Melee_Lance() {
        super(itemID, name, twoHanded, damageDice, reach, damageType);
    }
}