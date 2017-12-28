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
public class Melee_Warhammer extends Melee {
    private final static int itemID = 11041;
    private final static String name = "Warhammer";
    
    private final static boolean twoHanded = true;
    private final static int damageDice = 10;
    
    private final static boolean reach = false;
    private static final char damageType = 'b';

    public Melee_Warhammer() {
        super(itemID, name, twoHanded, damageDice, reach, damageType);
    }
}