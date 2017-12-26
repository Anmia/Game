/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author nerdi
 */
public class Proffesion_Fighter extends Proffesion {
    private static final int classID = 101;
    private static final int hitDice = 10;
    private static final boolean[] savingThrow = {true, 
        false, true, false, false, false};
    private static final int[] classAbilities = {1};
    private static final int[] proficiencies = {0};
    
    public Proffesion_Fighter() {
        super(classID, hitDice, savingThrow, classAbilities, proficiencies);
    }
    
    @Override
    public boolean checkProficiency(int what) {
        return true;
    }
}