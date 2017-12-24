/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * itemID uses branching value 
 * will be worked out later.
 * @author Magnus
 */
public abstract class Item {
    protected long itemID;
    private String name;
    private int amount;
    private int reqAtribute;
    private int reqLevel;
    
    public Item(long itemID, String name, int amount, 
            int reqAtribute, int reqLevel) {
        this.itemID = itemID;
        this.name = name;
        this.amount = amount;
        this.reqAtribute = reqAtribute;
        this.reqLevel = reqLevel;
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
}
