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
public class Race_Dragonborn extends Race{
    private final static int raceID = 02;
    private final static String raceName = "Dragonborn";
    private final static int speed = 30;
    private final static char size = 'm';
    private final static boolean darkvision = false;
    private final static int[] raceModifiers = {2, 0, 0, 0, 0, 1};

    public Race_Dragonborn() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers);
        }
}
