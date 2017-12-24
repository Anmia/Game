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
public class Race_Tiefling extends Race{
    private final static int raceID = 108;
    private final static String raceName = "Tiefling";
    private final static int speed = 30;
    private final static char size = 'm';
    private final static boolean darkvision = true;
    private final static int[] raceModifiers = {0, 0, 0, 0, 1, 2};
    private static final int[] raceAbilities = {1};

    public Race_Tiefling() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers, 
                raceAbilities);
    }
}
