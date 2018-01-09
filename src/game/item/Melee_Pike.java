/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

/**
 *
 * @author Magnus
 */
public class Melee_Pike extends Melee {
    private final static int itemID = 11037;
    private final static String name = "Handaxe";
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 10;
    
    private final static boolean reach = true;
    private static final char damageType = 'p';
    private static final boolean heavy = true;

    public Melee_Pike() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
    }
}