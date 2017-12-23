/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Uses Rock Gnome
 * @author nerdi
 */
public class Race_Gnome extends Race{
    private final static int raceID = 04;
    private final static String raceName = "Gnome";
    private final static int speed = 25;
    private final static char size = 's';
    private final static boolean darkvision = true;
    private final static int[] raceModifiers = {0, 0, 1, 0, 2, 0};

    public Race_Gnome() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers);
    }
}
