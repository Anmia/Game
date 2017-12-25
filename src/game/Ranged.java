/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Magnus
 */
public abstract class Ranged extends Weapon {
    private int[] range = new int[2];
    
    private final static int reqAtribute = 1;
    private final static int reqLevel = 0;
    private final static int modifierAtribute = 1;

    public Ranged(long itemID, String name, boolean towHanded, 
            int damageDice, int[] range) {
        super(itemID, name, reqAtribute, reqLevel, towHanded, 
                damageDice, modifierAtribute);
        this.range = range;
    }
    
    public int[] getRange() {
        return range;
    }
}
