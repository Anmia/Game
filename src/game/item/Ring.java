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
public class Ring extends Accesory {
    private final static int itemTypeID = 32;

    public Ring(int itemID, String name, int amount, int reqAtribute, int reqLevel) {
        super(itemID, name, amount, reqAtribute, reqLevel, itemTypeID);
    }

}
