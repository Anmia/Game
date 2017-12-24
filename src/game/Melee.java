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
public abstract class Melee extends Weapon {
    private boolean reach;

    public Melee(long itemID, String name, int amount, int reqAtribute, 
            int reqLevel, boolean withShield, int damageDice, 
            int modifierAtribute) {
        super(itemID, name, amount, reqAtribute, reqLevel, withShield, damageDice, modifierAtribute);
    }
    
    public boolean getReach() {
        return reach;
    }

}
