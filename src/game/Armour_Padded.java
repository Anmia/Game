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
public class Armour_Padded extends Armour{
    private final static long itemID = 20013;
    private final static String name = "Padded Armour";
    private final static int amount = 1;
    private final static int reqAtribute = 0;
    private final static int reqLevel = 0;
    private final static int armourClass = 11;
    private final static int armourType = 1;
    private final static boolean dexMod = true;
    private final static boolean stealthCheck = true;
    
    
    
    public Armour_Padded() {
        super(itemID, name, amount, reqAtribute, reqLevel, armourClass, 
                armourType, dexMod, stealthCheck);
    }
}
