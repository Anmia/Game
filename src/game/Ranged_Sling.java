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
public class Ranged_Sling extends Ranged{
    private static final int itemID = 12004;
    private static final String name = "Sling";
    
    private static final boolean towHanded = false;
    private static final int damageDice = 4;
    private static final int[] range = {30, 120};
    
    public Ranged_Sling() {
        super(itemID, name, towHanded, damageDice, range);
    }
}
