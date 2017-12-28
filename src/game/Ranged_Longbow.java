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
public class Ranged_Longbow extends Ranged{
    private static final int itemID = 12008;
    private static final String name = "Longbow";
    
    private static final boolean twoHanded = true;
    private static final int damageDice = 8;
    private static final int[] range = {150, 600};
    private static final char damageType = 'p';
    private static final boolean heavy = true;
    
    public Ranged_Longbow() {
        super(itemID, name, twoHanded, damageDice, range, damageType, heavy);
    }
}
