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
public class Melee_Warpick extends Melee {
    private final static int itemID = 11041;
    private final static String name = "Warpick";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 8;
    
    private final static boolean reach = false;
    private static final char damageType = 'p';
    private static final boolean heavy = false;
    
    

    public Melee_Warpick() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
        
    }
}
