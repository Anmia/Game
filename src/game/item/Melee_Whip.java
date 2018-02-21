/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

/**
 *
 * @author Anmia
 */
public class Melee_Whip extends Melee {
    private final static int itemID = 11043;
    private final static String name = "Whip";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 4;
    
    private final static boolean reach = true;
    private static final char damageType = 's';
    private static final boolean heavy = false;

    public Melee_Whip() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
        super.setModifierAtribute(1);
    }
}