/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

import game.item.Item;

/**
 *
 * @author Magnus
 */
public abstract class Weapon extends Item {
    private boolean twoHanded;
    private int damageDice;
    private int modifierAtribute;
    private char damageType;
    private boolean heavy;
    
    private final static int amount = 1;
    
    public Weapon(int itemID, String name, int reqAtribute, 
            int reqLevel, int itemTypeID, boolean twoHanded, int damageDice, 
            int modifierAtribute, char damageType, boolean heavy) {
        super(itemID, name, amount, reqAtribute, reqLevel, itemTypeID);
        this.twoHanded = twoHanded;
        this.damageDice = damageDice;
        this.modifierAtribute = modifierAtribute;
        this.damageType = damageType;
        this.heavy = heavy;
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
    
    public boolean getHeavy() {
        return heavy;
    }
    
    @Override
    public String toString() {
        return super.toString() + "| Two Handed: " + twoHanded + 
                " | DmgDice: " + damageDice + " | ModAtr: " + 
                modifierAtribute + " | Dmg Type: " + 
                damageType + " | Heavy: " + heavy;
    }
}
