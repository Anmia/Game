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
public class Melee_Handaxe extends Melee {
    private final static int itemID = 11004;
    private final static String name = "Handaxe";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 6;
    
    private final static boolean reach = false;
    private static final char damageType = 's';
    private static final boolean heavy = false;

    public Melee_Handaxe() {
        super(itemID, name, twoHanded, damageDice, reach, damageType, heavy);
    }
}
