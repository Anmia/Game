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
public class Ranged_Javelin extends Ranged {
    private static final int itemID = 11010;
    private static final String name = "Javelin";
    
    private static final boolean twoHanded = false;
    private static final int damageDice = 1;
    private static final int[] range = {30, 120};
    private final static int modifierAtribute = 0;
    private static final char damageType = 'p';
    
    public Ranged_Javelin() {
       super(itemID, name, twoHanded, damageDice, range, damageType);
    }
    
    @Override
    public int getModifierAtribute() {
        return this.modifierAtribute;
    }
}