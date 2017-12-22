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
    
    public Weapon(long itemID, String name, int amount, boolean withShield, 
            int[] damageDice, int modifierAtribute) {
        super(itemID, name, amount);
        this.withShield = withShield;
        this.damageDice = damageDice;
        this.modifierAtribute = modifierAtribute;
    }
    
    public int doDamage(Atributes help) {
        Dice dice = new Dice();
        int result = dice.rollDice(damageDice[0], damageDice[1]);
        
        int mod = help.getModifier(modifierAtribute);
        
        return result + mod;
    }
    
    public boolean getWithShield() {
        return withShield;
    }
    
}
