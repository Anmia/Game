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
public class Melee_Greataxe extends Melee {
    private final static int itemID = 11033;
    private final static String name = "Handaxe";
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 12;
    
    private final static boolean reach = false;
    private static final char damageType = 's';

    public Melee_Greataxe() {
        super(itemID, name, twoHanded, damageDice, reach, damageType);
    }
}