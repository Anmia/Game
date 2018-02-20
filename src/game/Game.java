/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.item.*;
import game.race.*;

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
        
        
        int[] atr = {17, 13, 15, 11, 13, 12};
        Melee battleaxe = new Melee_Battleaxe();
        Melee club = new Melee_Club();
        Atributes atri = new Atributes(atr);
        Armour armour = new Armour_Plate();
        Race dwarf = new Race_Dwarf();
        Ranged ranged = new Ranged_HandCrossbow();
        Ranged dart = new Ranged_Dart();
        Equipment equip = new Equipment(armour, null, null, null, battleaxe, ranged, false);
        
        Melee lance = new Melee_Lance();
        Melee handaxe = new Melee_Handaxe();
        
        Armour bp = new Armour_Breastplate();
        
        Item[] stuff = {lance, bp, club, handaxe, dart, null, null};
        Backpack pack = new Backpack(0, stuff, 100);
        
        Inventory inv = new Inventory(equip, pack);
        
        Proffesion fighter = new Proffesion_Fighter();
       
        Character me = new Character("Anmia", dwarf, fighter, inv, 1, 22, '@');
        me.setAtributes(atri);
        me.setArmourClass();
        me.createCharacter();

        Story story = new Story(me);
	System.out.println(story.txtDmp.getTitle());
	
	
        System.out.println("There is a real chance that any attempt at playing this game might fail. \n"
                + "This game uses D&D combat, meaning that dice are used and \n"
                + "that damage given and taken are, within set paramaters, random. \n"
                + "Think of it as rougelike, just kind of oposite. \n"
                + "This game features and will feature some language that may make \n"
		+ "children ask questions that adults may find awkward. \n"
                + "This game is not completed as of yet! \n"
                + "The author can be contacted on twitter as @Anmia_Ambraelle");
	
	
	story.storyFunk();
	
        Combat com = new Combat_FirstBattle(me);
        
//        com.combatFunction();
        
       
        
//        Character bandit = new NPC_Bandit();
//        
//        System.out.println(me);
//        System.out.println(bandit.getCurentHealthPoints());
//        
//        
//        
//         System.out.println(me.getInventory().equipment.getMeleeWeapon().getName());
//        
//         me.getInventory().changeEquiptment();
//        
//         System.out.println(me.getInventory().equipment.getMeleeWeapon().getName());
//        
//        
//        
//        
//        me.levelUp();
//        System.out.println(me);
    }
    
//This here is just so i have template 
//╔═╦═╦═╗
//║*║8║*║
//╠═╬═╬═╣
//║4║0║6║
//╠═╬═╬═╣
//║*║2║*║
//╚═╩═╩═╝
    
}