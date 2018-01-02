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
public abstract class Accesory extends Item {

    public Accesory(int itemID, String name, int amount, int reqAtribute, 
            int reqLevel, int itemTypeID) {
        super(itemID, name, amount, reqAtribute, reqLevel, itemTypeID);
    }

}
