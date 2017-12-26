/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author nerdi
 */
public class Melee_Greatclub extends Melee {
    private final static int itemID = 11003;
    private final static String name = "Gratclub";
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 8;
    
    private final static boolean reach = false;
    private static final char damageType = 'b';

    public Melee_Greatclub() {
        super(itemID, name, twoHanded, damageDice, reach, damageType);
    }
}
