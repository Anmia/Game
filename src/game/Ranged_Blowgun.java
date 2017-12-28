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
public class Ranged_Blowgun extends Ranged{
    private static final int itemID = 12005;
    private static final String name = "Blowgun";
    
    private static final boolean twoHanded = false;
    private static final int damageDice = 1;
    private static final int[] range = {25, 100};
    private static final char damageType = 'p';
    private static final boolean heavy = false;
    
    public Ranged_Blowgun() {
        super(itemID, name, twoHanded, damageDice, range, damageType, heavy);
    }
}
