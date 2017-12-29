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
public class Combat {
    private Character[] combatants = new Character[10];
    private int[][] combatOrder;
    private Dice dice = new Dice();
    
    public Combat(Character[] combatants) {
        this.combatants = combatants;
    }
    
    
    
    public void setCombatOrder() {
        
        
        for (int i = 0; i < combatants.length; i++) {
            combatOrder[i][0] = rollInitiative(i);
        }
        
        for (int i = 0; i < combatOrder.length; i++) {
            for (int j = 0; j < combatOrder.length - 1; j++) {
                if (combatOrder[j][0] > combatOrder[j +1][0]) {
                    int temp = combatOrder[j][0];
                    combatOrder[j][0] = combatOrder[j + 1][0];
                    combatOrder[j + 1][0] = temp;
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int rollInitiative(int combNum) {
        int mod = combatants[combNum].atributes.getModifier(1);
        
        return dice.rollDice(20, 1) + mod;
    }
    
    public int performAttack(Character attacker, Character defender) {
        int damage = 0;
        
        Dice dice = new Dice();
        
        int atkAtri = attacker.inventory.equipment.weapon.getModifierAtribute();
        int atkMod = attacker.atributes.getModifier(atkAtri);
        boolean wpnH = attacker.inventory.equipment.weapon.getHeavy();
        char atkSz = attacker.race.getSize();
        
        int atkRoll = 0;
        
        if ((wpnH) && (atkSz == 's')) {
            atkRoll = dice.rollDisAdvantage(atkAtri);
        } else {
            atkRoll = dice.rollDice(20, 1);
        }
        
        int defAC = defender.getCharArmourClass();
        
        if (atkRoll == 1 || defAC > atkRoll + atkMod) {
            damage = 0;
        } else {
            damage = dice.rollDice(attacker.inventory.equipment.weapon.getDamageDice(), 1);
        }
        
        return damage;
    }
}
