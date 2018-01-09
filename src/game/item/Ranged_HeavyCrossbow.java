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
public class Ranged_HeavyCrossbow extends Ranged{
    private static final int itemID = 12007;
    private static final String name = "Heavy Crossbow";
    
    private static final boolean towHanded = true;
    private static final int damageDice = 10;
    private static final int[] range = {100, 400};
    private static final char damageType = 'p';
    private static final boolean heavy = true;
    
    public Ranged_HeavyCrossbow() {
        super(itemID, name, towHanded, damageDice, range, damageType, heavy);
    }
}