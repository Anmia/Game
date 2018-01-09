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
public class Melee_Rapier extends Melee {
    private final static int itemID = 11038;
    private final static String name = "Rapier";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 8;
    
    private final static boolean reach = false;
    private static final char damageType = 'p';
    private static final boolean heavy = false;

    public Melee_Rapier() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
        super.setModifierAtribute(1);
    }
}