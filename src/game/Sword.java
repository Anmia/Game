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
public class Sword extends Melee {

    public Sword(long itemID, String name, int amount, boolean withShield, int[] damageDice, int modifierDmg) {
        super(itemID, name, amount, withShield, damageDice, modifierDmg);
    }

}
