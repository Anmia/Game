/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

/**
 *
 * @author nerdi
 */
public class Armour_Hide extends Armour{
    private final static int itemID = 20025;
    private final static String name = "Hide Armour";
    private final static int amount = 1;
    private final static int reqAtribute = 0;
    private final static int reqLevel = 0;
    private final static int armourClass = 12;
    private final static int armourType = 2;
    private final static boolean dexMod = true;
    private final static boolean stealthCheck = false;
    
    
    
    public Armour_Hide() {
        super(itemID, name, amount, reqAtribute, reqLevel, armourClass, 
                armourType, dexMod, stealthCheck);
    }
}
