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
public abstract class Item {
    protected long itemID;
    private String name;
    private int amount;
    
    public Item(long itemID, String name, int amount) {
        this.itemID = itemID;
        this.name = name;
        this.amount = amount;
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
}
