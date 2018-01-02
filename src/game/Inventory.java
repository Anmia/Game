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
    
    public void changeEquiptment() {
        
        System.out.print("Choose item type you wish to change (curently only 11, 12 and 20: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int type = sc.nextInt();
        
        backpack.showItemsOfType(type);
        
        System.out.print("Choose item type you wish to change (curently only 11, 12 and 20: ");
        
        int choose = sc.nextInt();
        
        
            if (type == 11) {
                Item eTb = equipment.getMeleeWeapon();
                Melee bTe = (Melee)backpack.getItem(choose);
                backpack.replaceItem(choose, eTb);
                equipment.setMeleeWeapon(bTe);
            } else if (type == 12) {
                Item eTb = equipment.getRangedWeapon();
                Ranged bTe = (Ranged)backpack.getItem(choose);
                backpack.replaceItem(choose, eTb);
                equipment.setRangedWeapon(bTe);
            } else if (type == 20) {
                Item eTb = equipment.getArmour();
                Armour bTe = (Armour)backpack.getItem(choose);
                backpack.replaceItem(choose, eTb);
                equipment.setArmour(bTe);
            }
        
        
    }
}
