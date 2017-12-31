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
        
        Melee sword = new Melee_Club();
        Atributes atri = new Atributes(atr);
        Armour armour = new Armour_Plate();
        Race dwarf = new Race_Dwarf();
        Ranged ranged = new Ranged_HandCrossbow();
        Equipment equip = new Equipment(armour, null, null, null, sword, ranged, false);
        
        Inventory inv = new Inventory(equip, null);
        
        Proffesion fighter = new Proffesion_Fighter();
       
        Character me = new Player("Anmia", dwarf, fighter, 
                inv, atri, 22, 1, 22, '@');
        
        Character enemy = new NPC_Bandit();
        
        System.out.println(me);
        System.out.println(enemy);
        
        int[][] loc = {{5, 15}, {1, 0}};
        
        Character[] cb  = {me, enemy};
        Combat com = new Combat(cb, loc);
        
        com.moveCombatantsByTurn();
    }
    
}