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
    private final static int itemTypeID = 12;

    public Ranged(int itemID, String name, boolean towHanded, 
            int damageDice, int[] range, char damageType, boolean heavy) {
        super(itemID, name, reqAtribute, reqLevel, itemTypeID, towHanded, 
                damageDice, modifierAtribute, damageType, heavy);
        this.range = range;
    }
    
    public int[] getRange() {
        return range;
    }
    
    @Override
    public String toString() {
        return super.toString() + "| Range: " + range[0] + " / " + range[1];
    }
}
