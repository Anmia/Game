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
public class Ranged_Shortbow extends Ranged{
    private static final int itemID = 12003;
    private static final String name = "Shortbow";
    
    private static final boolean twoHanded = true;
    private static final int damageDice = 6;
    private static final int[] range = {80, 320};
    private static final char damageType = 'p';
    private static final boolean heavy = false;
    
    public Ranged_Shortbow () {
        super(itemID, name, twoHanded, damageDice, range, damageType, heavy);
    }
}
