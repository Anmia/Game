/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.race;

/**
 * Uses Rock Gnome
 * @author nerdi
 */
public class Race_Gnome extends Race{
    private final static int raceID = 104;
    private final static String raceName = "Gnome";
    private final static int speed = 25;
    private final static char size = 's';
    private final static boolean darkvision = true;
    private final static int[] raceModifiers = {0, 0, 1, 0, 2, 0};
    private static final int[] raceAbilities = {1};

    public Race_Gnome() {
        super(raceID, raceName, speed, size, darkvision, raceModifiers, 
                raceAbilities);
        
//        setSubRace();
    }
    
//    private void setSubRace() {
//        System.out.println("You have the option between beeing a Forest Gnome /n"
//                + "or a Rock Gnome. The first give +1 to dex and the other +1 to con");
//        System.out.println("1 for Forest gnome and 2 for Rock Gnome. -");
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        int choice = sc.nextInt();
//        
//        switch(choice) {
//            case 1: 
//                raceModifiers[1] = 1; break;
//            case 2:
//                raceModifiers[2] = 1; break;
//        }
//    }
}
