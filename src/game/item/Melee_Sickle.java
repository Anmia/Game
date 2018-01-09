/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

/**
 *
 * @author nerdi
 */
public class Melee_Sickle extends Melee {
    private final static int itemID = 11008;
    private final static String name = "Sickle";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 4;
    
    private final static boolean reach = false;
    private static final char damageType = 's';
    private static final boolean heavy = false;

    public Melee_Sickle() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
    }
}
