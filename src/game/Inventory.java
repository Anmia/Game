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
public class Inventory {
    protected Equipment equipment;
    protected Backpack backpack;
    
    public Inventory (Equipment equipment, Backpack backpack) {
        this.equipment = equipment;
        this.backpack = backpack;
    }
    
    public Equipment getEquipment() {
        return equipment;
    }
    
    public Backpack getBackpack() {
        return backpack;
    }
}
