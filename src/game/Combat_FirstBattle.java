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
    private static Character bandit1 = new NPC_Bandit();
    private static Character bandit2 = new NPC_Bandit();
    
    private static final Character[] combatants = {null, bandit1, bandit2};
    private static final int[][] locations = {{5, 15}, {5, 8}, {6, 15}};
    
    private static final Maps map = new Maps_FirstBattle();

    public Combat_FirstBattle(Character player) {
        super(combatants, locations, map);
        Combat_FirstBattle.combatants[0] = player;
        
        
        
        super.setUpCombatMap();
    }
    
    
        
}
