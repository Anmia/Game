/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Uses stats for wood elf 
 * @author nerdi
 */
public class Race_Elf extends Race{
    private final static int raceID = 103;
    private final static String raceName = "Elf";
    private final static int speed = 30;
    private final static char size = 'm';
    private final static boolean darkvision = false;
    private final static int[] raceModifiers = {0, 2, 0, 1, 0, 0};

    public Race_Elf() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers);
    }
}