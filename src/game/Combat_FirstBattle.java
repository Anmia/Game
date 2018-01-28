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
public class Combat_FirstBattle extends Combat {
    
    private static final Character banditOne = new NPC_Bandit();
    private static final Character banditTwo = new NPC_Bandit();
    private static final Character banditThree = new NPC_Bandit();
    
   
    
    private static Character[] combatants = {null, banditOne, banditTwo, banditThree};
    private static final int[][] locations = {{5, 15}, {5, 8}, {6, 15}, {5, 5}};
    
    
    
    private static final Maps map = new Maps_FirstBattle();

    public Combat_FirstBattle(Character player) {
        super(combatants, locations, map);
        Combat_FirstBattle.combatants[0] = player;
        
        super.setUpCombatMap();
    }
    
    
        
}
