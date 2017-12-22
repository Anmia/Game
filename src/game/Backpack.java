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
public class Backpack {
    private int money;
    private Item[] itemsInBag;
    private int bagSize;
    
    public Backpack (int money, Item[] itemsInBag, int bagSize) {
        this.money = money;
        this.itemsInBag = itemsInBag;
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
        for (int i = 0; i < itemsInBag.length; i++) {
            if (itemID == itemsInBag[i].itemID) {
                if (itemsInBag[i].getAmount() == amount) {
                    itemsInBag[i] = null;
                    i = itemsInBag.length - 1;
                } else if (itemsInBag[i].getAmount() > amount) {
                    itemsInBag[i].lowerAmount(amount);
                    i = itemsInBag.length - 1;
                }
            }
        }
    }
    
    public void addToBag(Item item) {
        for (int i = 0; i < itemsInBag.length; i++) {
            if (itemsInBag[i] == null) {
                itemsInBag[i] = item;
                i = itemsInBag.length - 1;
            } else {
                if (itemsInBag.length == bagSize) {
                    System.out.println("Your inventory is full");
                } else {
                    Item temp[] = itemsInBag;
                    itemsInBag = new Item[temp.length + 1];
                    itemsInBag = temp;
                    itemsInBag[itemsInBag.length - 1] = item;
                }
            }
        }
    }
}
