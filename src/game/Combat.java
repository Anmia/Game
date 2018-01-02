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
    private int[][] locations;
    
    private int[][] combatOrder;
    private Dice dice = new Dice();
    Maps map = new Maps();
    
    
    public Combat(Character[] combatants, int[][] locations) {
        this.combatants = combatants;
        this.locations = locations;
        
        setUpCombatMap();
    }
    
    private void setUpCombatMap() {
        for (int i = 0; i < combatants.length; i++) {
            map.setInitialLocation(i, locations[i][0], locations[i][1], combatants[i].getIdentifyingChar());
        }
    }
    
    public void moveCombatantsByTurn() {
        System.out.println(map.getDistance(0, 1));
        
        while (!map.getEndCombat()) {
            for (int i = 0; i < combatants.length; i++) {
                for (int j = combatants[i].race.getSpeed() / 5; j > 0; j--) {
                    map.printMap();
                    System.out.println("you have " + j + " Moves left.");
                    System.out.print("Insert direction for " + combatants[i].getName() + 
                            "\n using WASD to chose direction or E to end turn.");
                    java.util.Scanner sc = new java.util.Scanner(System.in);
                    char direction = sc.next().charAt(0);

                    map.movePlayer(i, direction);
                    if (map.getEndMovement()) {
                        j = 0;
                    } else if (map.getObstacle()) {
                        j = j + 1; 
                    } else if (map.getEndCombat()) {
                        j = 0;
                        i = combatants.length;
                    }
                }
                
                if (map.getEndCombat()) {
                    i = combatants.length;
                }
            }
        }
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
    
    public void performMeleeAttack(Character attacker, Character defender) {
        int damage = 0;
        Dice dice = new Dice();
        int range = map.getDistance(0, 1);
        
        if (range == 5) {
            if (attacker.inventory.equipment.meleeWeapon != null) {
                int atkAtri = attacker.inventory.equipment.meleeWeapon.getModifierAtribute();
                int atkMod = attacker.atributes.getModifier(atkAtri);
                boolean wpnH = attacker.inventory.equipment.meleeWeapon.getHeavy();
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
                    damage = dice.rollDice(attacker.inventory.equipment.meleeWeapon.getDamageDice(), 1);
                }
            } else {
                /**
                 * for now unarmed damage is 1
                 * some classes does more, but for now it is 1
                 */
                damage = 1;
            }
        }
        
        
    }
    
    public int performRangedAttack(Character attacker, Character defender) {
        int damage = 0;
        
        int range = map.getDistance(0, 1);
        int wepRange[] = attacker.inventory.equipment.rangedWeapon.getRange();
        
        if (wepRange[0] < range && range < wepRange[1]) {
            int atkAtri = attacker.inventory.equipment.rangedWeapon.getModifierAtribute();
            int atkMod = attacker.atributes.getModifier(atkAtri);
            boolean wpnH = attacker.inventory.equipment.rangedWeapon.getHeavy();
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
                damage = dice.rollDice(attacker.inventory.equipment.rangedWeapon.getDamageDice(), 1);
            }
        }
        
        return damage;
    }
}
