/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author nerdi
 */
public class Dwarf extends Race{
    protected final static int raceID = 01;
    protected final static String raceName = "Dwarf";
    protected final static int speed = 25;
    protected final static char size = 'm';
    protected final static boolean darkvision = true;
    protected final static int[] raceModifiers = {0, 0, 2, 0, 0, 0};

    public Dwarf() {
        super(raceID, raceName, speed, size, darkvision);
    }
}
