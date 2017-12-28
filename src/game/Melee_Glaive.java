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
public class Melee_Glaive extends Melee {
    private final static int itemID = 11032;
    private final static String name = "Glaive";
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 10;
    
    private final static boolean reach = true;
    private static final char damageType = 's';
    private static final boolean heavy = true;

    public Melee_Glaive() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
    }
}