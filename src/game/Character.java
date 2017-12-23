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
public class Character {
    protected String name;
    protected Race race;
    private Inventory inventory;
    private Atributes atributes;
    private int healtPoints;
    private int level;
    private byte alignment;
    
    
    public Character (String name, Race race, Inventory inventory, 
            Atributes atributes, int healthPoints, int level, byte alignment) {
        this.name = name;
        this.race = race;
        this.inventory = inventory;
        this.atributes = atributes;
        this.healtPoints = healthPoints;
        this.level = level;
        this.alignment = alignment;
    }
    
    /**
     * For checking if something can be used (item)
     */
    
    public boolean checkUse(Weapon weapon) {
        int atribute = atributes.getAtribute(weapon.getReqAtribute());
        
        return (atribute < weapon.getReqLevel());
    }
    
    public int rollInitiative() {
        Dice dice = new Dice();
        
        return dice.rollDice(20, 1) + atributes.getModifier(1);
    }
    
    public int rollAdvantage(int atribute) {
        Dice dice = new Dice();
        
        int one = dice.rollDice(20, 1);
        int two = dice.rollDice(20, 1);
        
        if (one < two) {
            return two;
        } else if (one > two) {
            return one;
        } else {
            return one;
        }
    }
    
    public int rollDisAdvantage(int atribute) {
        Dice dice = new Dice();
        
        int one = dice.rollDice(20, 1);
        int two = dice.rollDice(20, 1);

        if (one > two) {
            return two;
        } else if (one < two) {
            return one;
        } else {
            return one;
        }
    }
    
    public int rollAttack(Weapon weapon) {
        Dice dice = new Dice();
        
        int[] roll = weapon.getDamageDice();
        
        int damage = dice.rollDice(roll[0], roll[1]) + 
                atributes.getModifier(weapon.getModifierAtribute());
        
        if (damage < 0) {
            return 0;
        } else {
            return damage;
        }
    }
}