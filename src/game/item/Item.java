/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

/**
 * itemID uses branching value 
 * will be worked out later.
 * @author Anmia
 */
public abstract class Item {
    protected int itemID;
    private String name;
    private int amount;
    private int reqAtribute;
    private int reqLevel;
    private int itemTypeID;
    
    public Item(int itemID, String name, int amount, 
            int reqAtribute, int reqLevel, int itemTypeID) {
        this.itemID = itemID;
        this.name = name;
        this.amount = amount;
        this.reqAtribute = reqAtribute;
        this.reqLevel = reqLevel;
        this.itemTypeID = itemTypeID;
    }
    
    public int getItemID() {
        return itemID;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public void lowerAmount(int mod) {
        amount = amount - mod;
    }
    
    public void increaseAmount(int mod) {
        amount = amount + mod;
    }
    
    public int getReqAtribute() {
        return reqAtribute;
    }
    
    public int getReqLevel() {
        return reqLevel;
    }
    
    public String getName() {
        return name;
    }
    
    public int getItemTypeID() {
        return itemTypeID;
    }
    
    
    @Override
    public String toString() {
        return "Item ID: " + itemID + " | TypeID: " + itemTypeID + 
                " | Name: " + name + " | Amount: " + amount + 
                " | Atr - Req: " + reqAtribute + " - " + reqLevel + " ";
    }
}
