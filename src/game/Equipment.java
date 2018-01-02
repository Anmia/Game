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
    protected Melee meleeWeapon;
    protected Ranged rangedWeapon;
    private boolean shield;
    
    
    public Equipment(Armour armour, Necklace necklace, Ring ringRight, 
            Ring ringLeft, Melee meleeWeapon, Ranged rangedWeapon, boolean shield) {
        this.armour = armour;
        this.necklace = necklace;
        this.ringRight = ringRight;
        this.ringLeft = ringLeft;
        this.meleeWeapon = meleeWeapon;
        this.rangedWeapon = rangedWeapon;
        this.shield = shield;
    }
    
    public Armour getArmour() {
        return armour;
    }
    
    public Necklace getNecklace() {
        return necklace;
    }
    
    public Ring getRingRight() {
        return ringRight;
    }
    
    public Ring getRingLeft() {
        return ringLeft;
    }
    
    public Melee getMeleeWeapon() {
        return meleeWeapon;
    }
    
    public Ranged getRangedWeapon() {
        return rangedWeapon;
    }
    
    public boolean getShield() {
        return shield;
    }
    
    public void setArmour(Armour armour) {
        this.armour = armour;
    }
    
    public void setMeleeWeapon(Melee meleeWeapon) {
        this.meleeWeapon = meleeWeapon;
    }
    
    public void setRangedWeapon(Ranged rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }
}