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
    private final static int modifierAtribute = 0;
    private final static int reqAtribute = 0; 
    private final static int reqLevel = 0;
    

    public Melee(int itemID, String name, boolean twoHanded, int damageDice, 
            boolean reach, char damageType, boolean heavy) {
        super(itemID, name, reqAtribute, reqLevel, twoHanded, 
                damageDice, modifierAtribute, damageType, heavy);
        this.reach = reach;
    }
    
    public boolean getReach() {
        return reach;
    }

}
