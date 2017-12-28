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
public class Melee_Flail extends Melee {
    private final static int itemID = 11031;
    private final static String name = "Flail";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 8;
    
    private final static boolean reach = false;
    private static final char damageType = 'b';
    private static final boolean heavy = false;

    public Melee_Flail() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
    }
}
