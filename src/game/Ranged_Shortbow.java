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
    private static final long itemID = 12003;
    private static final String name = "Shortbow";
    
    private static final boolean towHanded = true;
    private static final int damageDice = 6;
    private static final int[] range = {80, 320};
    
    public Ranged_Shortbow () {
        super(itemID, name, towHanded, damageDice, range);
    }
}
