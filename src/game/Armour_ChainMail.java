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
public class Armour_ChainMail extends Armour{
    private final static long itemID = 101103;
    private final static String name = "Chain Mail Armour";
    private final static int amount = 1;
    private final static int reqAtribute = 0;
    private final static int reqLevel = 13;
    private final static int armourClass = 16;
    private final static int armourType = 3;
    private final static boolean dexMod = false;
    private final static boolean stealthCheck = true;
    
    
    
    public Armour_ChainMail() {
        super(itemID, name, amount, reqAtribute, reqLevel, armourClass, 
                armourType, dexMod, stealthCheck);
    }
}
