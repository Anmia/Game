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
public class Ranged_HandCrossbow extends Ranged{
    private static final long itemID = 12006;
    private static final String name = "Hand Crossbow";
    
    private static final boolean towHanded = false;
    private static final int damageDice = 6;
    private static final int[] range = {30, 120};
    
    public Ranged_HandCrossbow() {
        super(itemID, name, towHanded, damageDice, range);
    }
}
