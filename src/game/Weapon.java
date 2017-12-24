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
    private boolean twoHanded;
    private int damageDice;
    private int modifierAtribute;
    
    public Weapon(long itemID, String name, int amount, int reqAtribute, 
            int reqLevel, boolean twoHanded, 
            int damageDice, int modifierAtribute) {
        super(itemID, name, amount, reqAtribute, reqLevel);
        this.twoHanded = twoHanded;
        this.damageDice = damageDice;
        this.modifierAtribute = modifierAtribute;
    }
    
    public boolean getTwoHanded() {
        return twoHanded;
    }
    
    public int getModifierAtribute() {
        return modifierAtribute;
    }
    
    public int getDamageDice() {
        return damageDice;
    }
}
