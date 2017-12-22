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
    protected byte raceID;
    protected String raceName;
    protected byte speed;
    protected char size;
    /**
     * 
     * @param raceID:
     * this atribute helps with identyfying the class and saves space
     * 
     * @param speed:
     * speed describes the distance the character can travel during combat
     * 
     * @param size Sizes are:
     * Small, Meddium, Large, Xlarge
     * This describes some weird movement stuff (figure out)
     */
    
    
    public Race(byte raceID, String raceName, byte speed, char size) {
        this.raceID = raceID;
        this.raceName = raceName;
        this.speed = speed;
        this.size = size;
    }
}
