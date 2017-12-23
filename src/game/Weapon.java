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
public abstract class Weapon extends Item {
    private boolean withShield;
    private int[] damageDice = new int[2];
    private int modifierAtribute;
    
    public Weapon(long itemID, String name, int amount, int reqAtribute, int reqLevel, boolean withShield, 
            int[] damageDice, int modifierAtribute) {
        super(itemID, name, amount, reqAtribute, reqLevel);
        this.withShield = withShield;
        this.damageDice = damageDice;
        this.modifierAtribute = modifierAtribute;
    }
    
    public boolean getWithShield() {
        return withShield;
    }
    
    public int getModifierAtribute() {
        return modifierAtribute;
    }
    
    public int[] getDamageDice() {
        return damageDice;
    }
}
