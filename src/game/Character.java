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
    
    
}
