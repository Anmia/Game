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
    private char damageType;
    
    private final static int amount = 1;
    
    public Weapon(int itemID, String name, int reqAtribute, 
            int reqLevel, boolean twoHanded, 
            int damageDice, int modifierAtribute, char damageType) {
        super(itemID, name, amount, reqAtribute, reqLevel);
        this.twoHanded = twoHanded;
        this.damageDice = damageDice;
        this.modifierAtribute = modifierAtribute;
        this.damageType = damageType;
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
    
    public char getDamageType() {
        return damageType;
    }
}
