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
public class Race_HalfOrc extends Race{
    private final static int raceID = 06;
    private final static String raceName = "Half Orc";
    private final static int speed = 30;
    private final static char size = 'm';
    private final static boolean darkvision = true;
    private final static int[] raceModifiers = {2, 0, 1, 0, 0, 0};

    public Race_HalfOrc() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers);
    }
}
