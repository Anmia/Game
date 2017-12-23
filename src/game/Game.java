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
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Curently there is test stuff here.
         * NetBeans gives me a warning if stuff don't work when I do changes <3
         */
        Story warning = new Story();
        System.out.println(warning.getWarning());
        
        int[] tab = {8, 1};
        int[] atr = {18, 14, 16, 12, 9, 8};
        
        Weapon sword = new Sword((long)5000, "Sword", 1, 0, 8, true, tab, 0);
        Atributes atri = new Atributes(atr);
        Armour armour = new Armour((long)1000, "Chainmail", 1, 0, 13, 16);
        
        Equipment equip = new Equipment(armour, null, null, null, sword, true);
        
        Inventory inv = new Inventory(equip, null);
       
        Character me = new Player("Anmia", null, inv, atri, 22, 1, (byte)22, 0);
        
        System.out.println(me.rollAttack(me));
        
        System.out.println(me.checkUse(sword));
        
        System.out.println(me.rollInitiative());
    }
    
}