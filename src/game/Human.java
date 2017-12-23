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
public class Human extends Race{
    protected final static byte raceID = (byte)001;
    protected final static String name = "Human";
    protected final static byte speed = 30;
    protected final static char size = 'm';
    
    
    public Human() {
        super((byte)001, "Human", (byte)30, 'm');
    }
    
    @Override
    public String toString() {
        return raceID + " | " + name  + " | " + speed + " | " + size;
    }
    
}
