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
public class NPC extends Character {
    private int expWorth;
    
    public NPC(String name, Race race, Inventory inventory, Atributes atributes, int healthPoints, int level, byte alignment, int expWorth) {
        super(name, race, inventory, atributes, healthPoints, level, alignment);
        this.expWorth = expWorth;
    }
    
}
