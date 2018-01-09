/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.item;

import game.item.Accesory;

/**
 *
 * @author Magnus
 */
public class Necklace extends Accesory {
    private final static int itemTypeID = 31;
 
    public Necklace(int itemID, String name, int amount, int reqAtribute, int reqLevel) {
        super(itemID, name, amount, reqAtribute, reqLevel, itemTypeID);
    }
 
}
