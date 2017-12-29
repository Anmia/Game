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
    private Character[] combatants;
    
    public Combat(Character[] combatants) {
        this.combatants = combatants;
    }
    
    public void moveCombatant() {
        
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
