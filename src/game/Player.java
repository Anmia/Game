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
public class Player extends Character {
    private int exp;
    
    public Player(String name, Race race, Proffesion proffesion, 
            Inventory inventory, Atributes atributes, int baseHealthPoints, 
            int level, int alignment, char identChar) {
        super(name, race, proffesion, inventory, atributes, 
                baseHealthPoints, level, alignment, identChar);
        this.exp = 0;
    }
    
    
    public int getExp() {
        return exp;
    }
    
    public void setExp(int newExp) {
        int level = super.getLevel();
        
        
    }
    
    
}
