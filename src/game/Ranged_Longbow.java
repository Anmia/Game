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
    private static final long itemID = 12008;
    private static final String name = "Longbow";
    
    private static final boolean towHanded = true;
    private static final int damageDice = 8;
    private static final int[] range = {150, 600};
    
    public Ranged_Longbow() {
        super(itemID, name, towHanded, damageDice, range);
    }
}
