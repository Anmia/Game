/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Figure out how to make the races and C_classes final and unchangeable
 * 
 *as with the c_clases, modyfier methods are needed. They are to run once upon 
 * creation and leveling up
 * @author Magnus
 */
public class Race {
    private int raceID;
    private String raceName;
    private int speed;
    private char size;
    private boolean darkvision;
    private int[] raceModifiers = new int[6];
    private int[] raceAbilities;
    
    public Race(int raceID, String raceName, int speed, 
            char size, boolean darkvision, int[] raceModifiers,
            int[] raceAbilities) {
        this.raceID = raceID;
        this.raceName = raceName;
        this.speed = speed;
        this.size = size;
        this.darkvision = darkvision;
        this.raceModifiers = raceModifiers;
        this.raceAbilities = raceAbilities;
    }
    
    public int getRaceID() {
        return raceID;
    }
    
    public String getRaceName() {
        return raceName;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public char getSize() {
        return size;
    }
    
    public boolean getDarkvision() {
        return darkvision;
    }
    
    public int[] getRaceModifiers() {
        return raceModifiers;
    }
}
