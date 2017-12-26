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
public abstract class Proffesion {
    private int classID;
    private int hitDice;
    private boolean[] savingThrow = new boolean[6];
    private int[] classAbilities;
    private int[] proficiencies;
    
    
    public Proffesion(int classID, int hitDice, boolean[] savingThrow, 
            int[] classAbilities, int[] proficiencies) {
        this.classID = classID;
        this.hitDice = hitDice;
        this.savingThrow = savingThrow;
        this.classAbilities = classAbilities;
        this.proficiencies = proficiencies;
    }
    
    public int getClassID() {
        return classID;
    }
    
    public int getHitDice() {
        return hitDice;
    }
    
    public boolean[] getSavingThrow() {
        return savingThrow;
    }
    
    public int[] getClassAbilities() {
        return classAbilities;
    }
    
    public int[] getProficiencies() {
        return proficiencies;
    }
    
    public boolean checkProficiency(int what) {
        boolean proficient = false;
        for (int i = 0; i < proficiencies.length; i++) {
            if (what == proficiencies[i]) {
                proficient = true;
            }
        }
        return proficient;
    }
}
