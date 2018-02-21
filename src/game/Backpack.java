/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.item.Item;

/**
 *
 * @author Anmia
 */
public class Backpack {
    private int money;
    private Item[] bag;
    private int bagSize;
    
    /**
     *
     * @param money
     * @param bag
     * @param bagSize
     */
    public Backpack (int money, Item[] bag, int bagSize) {
        this.money = money;
        this.bag = bag;
        this.bagSize = bagSize;
    }
    
    /**
     * 
     * @param itemID
     * which item is to be removed
     * @param amount 
     * how much is to be removed
     */
    public void removeFromBag(long itemID, int amount) {
        for (int i = 0; i < bag.length; i++) {
            if (itemID == bag[i].getItemID()) {
                if (bag[i].getAmount() == amount) {
                    bag[i] = null;
                    i = bag.length - 1;
                } else if (bag[i].getAmount() > amount) {
                    bag[i].lowerAmount(amount);
                    i = bag.length - 1;
                }
            }
        }
    }
    
    public void addToBag(Item item) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == null) {
                bag[i] = item;
            } 
        }
    }
    
    /**
     * returns how much money the character has.
     * @return
     */
    public int getMoney() {
        return money;
    }
    
    public void printBackpack() {
        int empty = 0;
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == null) {
                empty++;
            } else {
                System.out.println("Nr. " + i + " - " + bag[i].toString());
            }
        }
        
        System.out.println("There are " + empty + " empty slots in your bag.");
    }
    
    /**
     * Shows items of a certain type
     * the number i is used for selection in other functions
     * @param type
     */
    public void showItemsOfType(int type) {
        for (int i = 0; i < bag.length; i++) {
            if (!(bag[i] == null)) {
                if(bag[i].getItemTypeID() == type) {
                    System.out.println("Nr. " + i + " -|- " + bag[i].toString());
                }
            }
        }
    }
    
    public Item getItem(int x) {
        return bag[x];
    }
    
    public void replaceItem(int x, Item item) {
        this.bag[x] = item;
    }
}
