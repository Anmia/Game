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
        int[] tab = {6, 1};
        int[] atr = {5, 14, 16, 12, 9, 8};
        
        Weapon sword = new Sword((long)5000, "Sword", 1, true, tab, 1);
        Atributes atri = new Atributes(atr);
        Race elf = new Race((byte)001, "Elf", (byte)30, 'm');
        Equipment equip = new Equipment(null, null, null, null, sword, null);
        
        Inventory inv = new Inventory(equip, null);
       
        Character me = new Player("Anmia", elf, inv, atri, 22, 1, (byte)22, 0);
        
        System.out.println(sword.doDamage(atri));
    }
    
}