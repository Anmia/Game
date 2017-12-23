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
    protected int raceID;
    protected String raceName;
    protected int speed;
    protected char size;
    protected boolean darkvision;
    protected int[] raceModifiers;
    
    public Race(int raceID, String raceName, int speed, 
            char size, boolean darkvision) {
        this.raceID = raceID;
        this.raceName = raceName;
        this.speed = speed;
        this.size = size;
        this.darkvision = darkvision;
        
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
