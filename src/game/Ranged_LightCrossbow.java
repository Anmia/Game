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
    private static final long itemID = 12001;
    private static final String name = "Light Crossbow";
    
    private static final boolean withShield = false;
    private static final int damageDice = 8;
    private static final int[] range = {80, 320};
    
    public Ranged_LightCrossbow() {
        super(itemID, name, withShield, damageDice, range);
    }
}
