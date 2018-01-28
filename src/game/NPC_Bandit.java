/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.item.Ranged_LightCrossbow;
import game.item.Ranged;
import game.item.Melee_Scimitar;
import game.item.Melee;
import game.item.Armour_Leather;
import game.item.Armour;
import game.race.Race;
import game.race.Race_Dwarf;

/**
 *
 * @author Magnus
 */
public class NPC_Bandit extends NPC {
    private static final String name = "Bandit";
    private static final Race race = new Race_Dwarf();
    private static final Proffesion proffesion = new Proffesion_Fighter();
    
    static Armour arm = new Armour_Leather();
    static Melee mwep = new Melee_Scimitar();
    static Ranged rwep = new Ranged_LightCrossbow();
    
    static Equipment stuff = new Equipment(arm, null, null, null, mwep, rwep, false);
    private final static Inventory inventory = new Inventory(stuff, null);
    
    private static final int[] atr = {11, 12, 12, 10, 10, 10};
    private static final Atributes atributes = new Atributes(atr);
    
    private static final int baseHealthPoints = 0;
    private static final int level = 1;
    private static final int alignment = 23;
    private static final char identifyingChar = '#';
    private static final int expWorth = 25;
    
    
    public NPC_Bandit() {
        super(name, race, proffesion, inventory, atributes, baseHealthPoints, level, alignment, identifyingChar, expWorth);
    }
    
}
