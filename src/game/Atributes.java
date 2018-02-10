/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Find way to add proficiencies etc
 * @author Magnus
 */


public class Atributes {
    
    /**
     * atributesBase describes the base set of atributes for the character
     */
    protected int[] atributesBase = new int[6];
    /**
     * atributesActual describes the modified atributes of the character
     * this is based on atributesBase in adition to any item that increases or decrease 
     * the value of an atribute
     */
    protected int[] atributesActual = new int[6];
    

    
    /**
     * Atributes are in the following order!
     * strength - dexterity - constitution - wisdom - inteligence - charisma 
     * atributesBase contains the base atributes 
     * atributesActual contains the atributes after moddification from item or 
     * spells etc
     * 
     * BE VERY CAREFUL WHEN USING CLASS
     * 
     * NOTE: Find way to increase atributesBase for level ups etc...
     * @param atributesBase
     */
    
    public Atributes(int[] atributesBase) {
        this.atributesBase = atributesBase;
        this.atributesActual = atributesBase;
    }
    
    /**
     *
     * @param atribute
     * @return the modifier based on the atribute
     */
    public int getModifier(int atribute) {
        int modifier = 0;
        switch(atributesActual[atribute]) {
            case 1: modifier = -5; break;
            case 2: case 3: modifier = -4; break;
            case 4: case 5: modifier = -3; break;
            case 6: case 7: modifier = -2; break;
            case 8: case 9: modifier = -1; break;
            case 10: case 11: modifier = 0; break;
            case 12: case 13: modifier = 1; break;
            case 14: case 15: modifier = 2; break;
            case 16: case 17: modifier = 3; break;
            case 18: case 19: modifier = 4; break;
            case 20: case 21: modifier = 5; break;
            case 22: case 23: modifier = 6; break;
            case 24: case 25: modifier = 7; break;
            case 26: case 27: modifier = 8; break;
            case 28: case 29: modifier = 9; break;
            case 30: modifier = 10; break;
        }
        return modifier;
    }
    
    public int getAtribute(int whichAtribute) {
        return atributesActual[whichAtribute];
    }
    
        
    public void resetAtribute(int atribute) {
        atributesActual[atribute] = atributesBase[atribute];
    }
    
    public void modifyAtribute(int atribute, int modifier) {
        atributesActual[atribute] = atributesActual[atribute] + modifier;
    }
    
    public void setCharacterCreationBase(int atribute, int modifier) {
        atributesBase[atribute] = atributesBase[atribute] + modifier;
        atributesActual[atribute] = atributesBase[atribute];
    }
}