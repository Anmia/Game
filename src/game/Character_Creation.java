/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.race.Race;

/**
 * For creating a character at the begining of the game
 * will use some things from D%D, but not all. 
 * NOTE: D&D Copyright???
 * @author Anmia
 */
public class Character_Creation {
    private String name;
    private Race race;
    private Proffesion proffesion;
    private Inventory inventory;
    private Atributes atributes;    
    
    private int level = 1;
    
    private char identifyingChar = '@';
    
    
    public Character_Creation() {
	
    }
    
}
