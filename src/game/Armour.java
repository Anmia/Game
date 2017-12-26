/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Magnus
 */
public abstract class Armour extends Item {
    private int armourClass;
    private int armourType;
    private boolean dexMod;
    private boolean stealthCheck;
    
    public Armour(int itemID, String name, int amount, int reqAtribute, 
            int reqLevel, int armourClass, int armourType, boolean dexMod, 
            boolean stealthCheck) {
        
        super(itemID, name, amount, reqAtribute, reqLevel);
        this.armourClass = armourClass;
        this.armourType = armourType;
        this.dexMod = dexMod;
        this.stealthCheck = stealthCheck;
    }
    
    public int getAC() {
        return armourClass;
    }
    
    public int getArmourType() {
        return armourType;
    }
    
    public boolean getDexMod() {
        return dexMod;
    }
    
    public boolean getStealthCheck() {
        return stealthCheck;
    }
}
