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
        
        int[] atr = {18, 14, 16, 12, 9, 8};
        
        Weapon sword = new Melee_Club();
        Atributes atri = new Atributes(atr);
        Armour armour = new Armour_Plate();
        Race dwarf = new Race_Dwarf();
        Equipment equip = new Equipment(armour, null, null, null, sword, false);
        
        Inventory inv = new Inventory(equip, null);
        
        Proffesion fighter = new Proffesion_Fighter();
       
        Character me = new Player("Anmia", dwarf, fighter, 
                inv, atri, 22, 1, 22, 0);
        
        Character enemy = new Player("Anmia", dwarf, fighter, 
                inv, atri, 22, 1, 22, 0);
        
        Weapon jav = new Ranged_Javelin();
        
        Maps map = new Maps();
        
//        Combat com = new Combat();
        
//        System.out.println(com.performAttack(me, me));
        
        map.printMap();
        map.locateChar();
        map.getXY();
        
        while (!map.getEndMovement()) {
            map.printMap();
            map.locateChar();
            System.out.print("Insert direction for Nr.1 using WASD: ");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            char direction = sc.next().charAt(0);
            map.movePlayer(direction);
        }
        
        
    }
    
}