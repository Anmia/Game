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
public class Armour extends Item {
    private int armourClass;
    
    public Armour(long itemID, String name, int amount, int reqAtribute, int reqLevel, int armourClass) {
        super(itemID, name, amount, reqAtribute, reqLevel);
        this.armourClass = armourClass;
    }
    
    public int getAC() {
        return armourClass;
    }
}
