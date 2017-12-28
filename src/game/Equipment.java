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
public class Equipment{
    protected Armour armour;
    protected Necklace necklace;
    protected Ring ringRight;
    protected Ring ringLeft;
    protected Weapon weapon;
    private boolean shield;
    
    
    public Equipment(Armour armour, Necklace necklace, Ring ringRight, 
            Ring ringLeft, Weapon weapon, boolean shield) {
        this.armour = armour;
        this.necklace = necklace;
        this.ringRight = ringRight;
        this.ringLeft = ringLeft;
        this.weapon = weapon;
        this.shield = shield;
    }
    
    public boolean getShield() {
        return shield;
    }
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}