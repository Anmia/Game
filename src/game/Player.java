/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.race.Race;

/**
 *
 * @author Magnus
 */
public class Player extends Character {
    private int exp;
    
    public Player(String name, Race race, Proffesion proffesion, 
            Inventory inventory, Atributes atributes, 
            int level, int alignment, char identChar) {
        super(name, race, proffesion, inventory, atributes, 
                level, alignment, identChar);
        this.exp = 0;
    }
    
    
    public int getExp() {
        return exp;
    }
    
    public void setExp(int newExp) {
        int level = super.getLevel();
        
        exp = exp + newExp;
        
        switch (level) {
            case 1:
                if (exp >= 300) {
                    super.levelUp();
                } break;
                
            case 2:
                if (exp >= 900) {
                    super.levelUp();
                } break;
                
            case 3:
                if (exp >= 2700) {
                    super.levelUp();
                } break;
                
            case 4:
                if (exp >= 6500) {
                    super.levelUp();
                } break;
                
            case 5:
                if (exp >= 14000) {
                    super.levelUp();
                } break;
                
            case 6:
                if (exp >= 23000) {
                    super.levelUp();
                } break;
                
            case 7:
                if (exp >= 34000) {
                    super.levelUp();
                } break;
            
            case 8:if (exp >= 48000) {
                    super.levelUp();
                } break;
                
            case 9: 
                if (exp >= 64000) {
                    super.levelUp();
                } break;
                
            case 10:
                if (exp >= 85000) {
                    super.levelUp();
                } break;
                
            case 11:
                if (exp >= 100000) {
                    super.levelUp();
                } break;
                
            case 12:
                if (exp >= 120000) {
                    super.levelUp();
                } break;
                
            case 13:
                if (exp >= 140000) {
                    super.levelUp();
                } break;
            
            case 14:
                if (exp >= 165000) {
                    super.levelUp();
                } break;
                
            case 15:
                if (exp >= 195000) {
                    super.levelUp();
                } break;
            
            case 16:
                if (exp >= 225000) {
                    super.levelUp();
                } break;
                
            case 17:
                if (exp >= 265000) {
                    super.levelUp();
                } break;
                
            case 18:
                if (exp >= 305000) {
                    super.levelUp();
                } break;
                
            case 19:
                if (exp >= 355000) {
                    super.levelUp();
                } break;
                
            default: break;
        }
    }  
}
