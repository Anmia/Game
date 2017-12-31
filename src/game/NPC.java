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
    
    public NPC(String name, Race race, Proffesion proffesion, 
            Inventory inventory, Atributes atributes, int healthPoints, 
            int level, int alignment, char identChar, int expWorth) {
        super(name, race, proffesion, inventory, atributes, 
                healthPoints, level, alignment, identChar);
        this.expWorth = expWorth;
    }
    
    public int getExpWorth() {
        return expWorth;
    }    
}
