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
    private byte armourClass;
    
    public Armour(long itemID, String name, int amount, byte armourClass) {
        super(itemID, name, amount);
        this.armourClass = armourClass;
    }
    
    

}
