/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Based on mountain dwarf
 * @author nerdi
 */
public class Race_Dwarf extends Race{
    private final static int raceID = 101;
    private final static String raceName = "Dwarf";
    private final static int speed = 25;
    private final static char size = 'm';
    private final static boolean darkvision = true;
    private final static int[] raceModifiers = {2, 0, 2, 0, 0, 0};

    public Race_Dwarf() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers);
    }
}
