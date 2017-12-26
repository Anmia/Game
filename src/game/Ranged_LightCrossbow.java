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
public class Ranged_LightCrossbow extends Ranged{
    private static final int itemID = 12001;
    private static final String name = "Light Crossbow";
    
    private static final boolean twoHanded = true;
    private static final int damageDice = 8;
    private static final int[] range = {80, 320};
    private static final char damageType = 'p';
    
    public Ranged_LightCrossbow() {
        super(itemID, name, twoHanded, damageDice, range, damageType);
    }
}