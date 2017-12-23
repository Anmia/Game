/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Based on Lightfoot Halfling
 * @author nerdi
 */
public class Race_Halfling extends Race{
    private final static int raceID = 05;
    private final static String raceName = "Halfling";
    private final static int speed = 25;
    private final static char size = 's';
    private final static boolean darkvision = false;
    private final static int[] raceModifiers = {0, 2, 0, 0, 0, 1};

    public Race_Halfling() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers);
    }
}
