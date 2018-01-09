/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.race;

/**
 *
 * @author nerdi
 */
public class Race_Human extends Race{
    private final static int raceID = 107;
    private final static String raceName = "Human";
    private final static int speed = 30;
    private final static char size = 'm';
    private final static boolean darkvision = false;
    private final static int[] raceModifiers = {1, 1, 1, 1, 1, 1};
    private static final int[] raceAbilities = {1};

    public Race_Human() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers,
                 raceAbilities);
    }
}
