/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * as with the races, modyfier methods are needed. They are to run once upon 
 * creation and leveling up
 * @author Magnus
 */
public class C_Class {
    private int classID;
    private int hitDice;
    private boolean[] savingThrow = new boolean[6];
    private int[] classAbilities;
    
    
    public C_Class(int classID, int hitDice, boolean[] savingThrow, 
            int[] classAbilities) {
        this.classID = classID;
        this.hitDice = hitDice;
        this.savingThrow = savingThrow;
        this.classAbilities = classAbilities;
    }
}
