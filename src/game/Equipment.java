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
    private Armour armour;
    private Necklace necklace;
    private Ring ringRight;
    private Ring ringLeft;
    private Weapon weaponRight;
    private Weapon weaponLeft;
    
    public Equipment(Armour armour, Necklace necklace, Ring ringRight, 
            Ring ringLeft, Weapon weaponRight, Weapon weaponLeft) {
        this.armour = armour;
        this.necklace = necklace;
        this.ringRight = ringRight;
        this.ringLeft = ringLeft;
        this.weaponRight = weaponRight;
        this.weaponLeft = weaponLeft;
    }
    
    /**
     * The below methods are "set" functions
     * They use equip and unequip as monicers
     * They give a value and null respectively
     */
    
    public void equipArmour(Armour armour) {
        this.armour = armour;
    }
    
    public void unequipArmour() {
        this.armour = null;
    }
    
    public void equipNecklace(Necklace necklace) {
        this.necklace = necklace;
    }
    
    public void unequipNecklace() {
        this.necklace = null;
    }
    
    public void equipRingRight(Ring ring) {
        this.ringRight = ring;
    }
    
    public void unequipRingRight() {
        this.ringRight = null;
    }
    
    public void equipRingLeft(Ring ring) {
        this.ringLeft = ring;
    }
    
    public void unequipRingLeft() {
        this.ringLeft = null;
    }
    
    public void equipWeaponRight(Weapon weapon) {
        this.weaponRight = weapon;
    }
    
    public void unequipWeaponRight() {
        this.weaponRight = null;
    }
    
    public void equipWeaponLeft(Weapon weapon) {
        this.weaponLeft = weapon;
    }
    
    public void unequipWeaponLeft() {
        this.weaponLeft = null;
    }
}
