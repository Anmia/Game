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
        
        Melee club = new Melee_Club();
        Atributes atri = new Atributes(atr);
        Armour armour = new Armour_Plate();
        Race dwarf = new Race_Dwarf();
        Ranged ranged = new Ranged_HandCrossbow();
        Ranged dart = new Ranged_Dart();
        Equipment equip = new Equipment(armour, null, null, null, club, ranged, false);
        
        Melee lance = new Melee_Lance();
        Melee handaxe = new Melee_Handaxe();
        
        Armour bp = new Armour_Breastplate();
        
        Item[] stuff = {lance, bp, club, handaxe, dart, null, null};
        Backpack pack = new Backpack(0, stuff, 100);
        
        Inventory inv = new Inventory(equip, pack);
        
        Proffesion fighter = new Proffesion_Fighter();
       
        Character me = new Player("Anmia", dwarf, fighter, 
                inv, atri, 0, 1, 22, '@');
        
        Character bandit = new NPC_Bandit();
        Character guard = new NPC_Guard();
        
        System.out.println(me);
        System.out.println(bandit.getCurentHealthPoints());
        
        int[][] loc = {{5, 15}, {5, 14}, {6, 15}};
        
        Character[] cb  = {me, bandit, guard};
        Combat com = new Combat(cb, loc);
        
        System.out.println(me.getInventory().equipment.getMeleeWeapon().getName());
        
        // me.inventory.changeEquiptment();
        
        System.out.println(me.getInventory().equipment.getMeleeWeapon().getName());
        
        com.combatFunction();
        
        //com.moveCombatantsByTurn();
        //me.levelUp();
        //System.out.println(me);
        
        //System.out.println(club);
        //System.out.println(armour);
        
//        boolean cont = true;
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        while (cont) {
//            System.out.print("Insert direction for Nr.1 using WASD: ");
//            
//            char yn = sc.next().charAt(0);
//            
//            if (yn == 'n') {
//                cont = false;
//            } else {
//                System.out.println("Choose function you wish to run");
//                System.out.println("10 for movement.");
//                System.out.println("11 for equipemt swap");
//                System.out.println();
//                int func = sc.nextInt();
//            }
//            
//            
//        }
        
    }
    
    
    
}