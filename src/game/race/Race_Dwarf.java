/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.race;

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
    private static final int[] raceAbilities = {1};

    public Race_Dwarf() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers, 
                raceAbilities);
        
//        setSubRace();
    }
    
//    private void setSubRace() {
//        System.out.println("Hill Dwarf = wis +1. Mountain Dwarf = Str +2. \n"
//                + "1 for Hill and 2 for maountain. -");
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        int choice = sc.nextInt();
//        
//        switch(choice) {
//            case 1: 
//                raceModifiers[3] = 1; break;
//            case 2:
//                raceModifiers[0] = 1; break;
//        }
//    }
}
