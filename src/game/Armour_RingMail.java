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
public class Armour_RingMail extends Armour{
    private final static long itemID = 20034;
    private final static String name = "Ring Mail Armour";
    private final static int amount = 1;
    private final static int reqAtribute = 0;
    private final static int reqLevel = 0;
    private final static int armourClass = 14;
    private final static int armourType = 3;
    private final static boolean dexMod = false;
    private final static boolean stealthCheck = true;
    
    
    
    public Armour_RingMail() {
        super(itemID, name, amount, reqAtribute, reqLevel, armourClass, 
                armourType, dexMod, stealthCheck);
    }
}
