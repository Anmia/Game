/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.item.Necklace;
import game.item.Ring;
import game.item.Ranged;
import game.item.Melee;
import game.item.Armour;

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
    
    public boolean hasMeleeWeapon() {
        return meleeWeapon == null;
    }
    
    public boolean hasRangedWeapon() {
        return rangedWeapon == null;
    }
    
    
    public void printeEuipment() {
        String armourName;
        String necklaceName;
        String ringRightName;
        String ringLeftName;
        String meleeWeaponName;
        String rangedWeaponName;
        
        if ( armour == null) {
            armourName = "none";
        } else {
            armourName = armour.getName();
        }
        
        if ( necklace == null) {
            necklaceName = "none";
        } else {
            necklaceName = necklace.getName();
        }
        
        if ( ringRight == null) {
            ringRightName = "none";
        } else {
            ringRightName = ringRight.getName();
        }
        
        if ( ringLeft == null) {
            ringLeftName = "none";
        } else {
            ringLeftName = ringLeft.getName();
        }
        
        if ( meleeWeapon == null) {
            meleeWeaponName = "none";
        } else {
            meleeWeaponName = meleeWeapon.getName();
        }
        
        if ( rangedWeapon == null) {
            rangedWeaponName = "none";
        } else {
            rangedWeaponName = rangedWeapon.getName();
        }
        
        System.out.println("\n Melee weapon: " + meleeWeaponName + " Ranged Weapon: " + rangedWeaponName 
		+ "\n Armour: " + armourName + "\n");
    }
}