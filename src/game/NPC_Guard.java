/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.item.Ranged_Javelin;
import game.item.Ranged;
import game.item.Melee;
import game.item.Melee_Spear;
import game.item.Armour_ChainShirt;
import game.item.Armour;
import game.race.Race;
import game.race.Race_Human;

/**
 *
 * @author nerdi
 */
public class NPC_Guard extends NPC {
    private static final String name = "Guard";
    private static final Race race = new Race_Human();
    private static final Proffesion proffesion = new Proffesion_Fighter();
    
    static Armour arm = new Armour_ChainShirt();
    static Melee mwep = new Melee_Spear();
    static Ranged rwep = new Ranged_Javelin();
    
    static Equipment stuff = new Equipment(arm, null, null, null, mwep, rwep, true);
    private final static Inventory inventory = new Inventory(stuff, null);
    
    static int[] atr = {13, 12, 12, 10, 10, 10};
    private final static Atributes atributes = new Atributes(atr);
    
    private static final int baseHealthPoints = 11;
    private static final int level = 1;
    private static final int alignment = 22;
    private static final char identifyingChar = '§';
    private static final int expWorth = 25;
    
    
    public NPC_Guard() {
        super(name, race, proffesion, inventory, 
                level, alignment, identifyingChar, expWorth);
        super.setAtributes(atributes);
    }
    
}
