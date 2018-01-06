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
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
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
    
    public void combatMove(int i) {
        for (int j = combatants[i].race.getSpeed() / 5; j > 0; j--) {
            map.printMap();
            System.out.println("you have " + j + " Moves left.");
            System.out.print("Insert direction for " + combatants[i].getName() + 
                    " using WASD to chose direction or E to end turn: ");

            char direction = sc.next().charAt(0);

            map.movePlayer(i, direction);
            if (map.getEndMovement()) {
                j = 0;
            } else if (map.getObstacle()) {
                j = j + 1; 
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
    
    boolean notEnd = true;
    
    public void combatFunction() {
        int two = 0;
        while (notEnd) {
            for (int one = 0; one < combatants.length; one++) {
                
                if (one == 0) {
                    two = 1;
                } else if (one == 1) {
                    two = 0;
                }
                for (int a = 0; a < combatants.length; a++) {
                    System.out.println(combatants[a].getName() + " " + combatants[a].printHelthStatus());
                    
                }
                
                map.printMap();
                
                
                
                boolean actionBool = true;
                while (actionBool) {
                    
                    System.out.print("Choose an action for " + combatants[one].getName() + ". m for move, a for "
                            + "attack, c to end: ");
                    char actionChar = sc.next().charAt(0);

                    if (actionChar == 'm') {
                        combatMove(one);
                        
                        boolean secChoiceBool = true;
                        while (secChoiceBool) {
                            System.out.print("Do you wish to attack?  y/n: ");
                        
                            char secChoice = sc.next().charAt(0);

                            if (secChoice == 'y') {
                                attack(one);
                                
//                                if (combatants[two].getCurentHealthPoints() <= 0) {
//                                    notEnd = false;
//                                    actionBool = false;
//                                    secChoiceBool = false;
//                                    one = combatants.length;
//                            
//                                    System.out.println(combatants[two].getName() + " is dead. Combat is over!");
//                                }
                                
                                secChoiceBool = false;
                            } else if (secChoice == 'n') {
                                secChoiceBool = false;
                            } else {
                                System.out.println("Please choose a valid option.");
                            }
                        }
                        actionBool = false;
                    } else if (actionChar == 'a') {
                        attack(one); 
                        boolean secChoiceBool = true;
                        
                        while (secChoiceBool) {
                            System.out.print("Do you wish to move?  y/n: ");
                        
                            char secChoice = sc.next().charAt(0);

                            if (secChoice == 'y') {
                                combatMove(one);
                                secChoiceBool = false;
                            } else if (secChoice == 'n') {
                                secChoiceBool = false;
                            } else {
                                System.out.println("Please choose a valid option: ");
                            }
                        }
                        actionBool = false;
                    } else if (actionChar == 'c') {
                        notEnd = false;
                        actionBool = false;
                        one = combatants.length;
                    } else {
                        System.out.println("Please choose a valid option: ");
                    }
                }
                
            }
            
        }
    }
    
    private void attack(int one) {
        boolean attackBool = true;
                                
        while (attackBool) {
            System.out.print("M for Melee, r for ranged, c to cancel.");
            char attack = sc.next().charAt(0);
            
            if (attack == 'm') {
                char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f'};
                int alphaCount = 0;
                boolean[] inRange = map.withinRange(one, 5, 5);
                for (int i = 0; i < inRange.length; i++) {
                    if (inRange[i]) {
                        System.out.println("<" + alphabet[alphaCount] + "> | Name: " + 
                                combatants[i].getName() + " | " + 
                                map.getLocation(i));
                        alphaCount++;
                    }
                }
                
                System.out.print("Choose target: ");
                char target = sc.next().charAt(0);
                
                
                
                attackBool = false;
            } else if (attack == 'r') {
                char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f'};
                int alphaCount = 0;
                int[] range = combatants[one].getInventory().equipment.getRangedWeapon().getRange();
                boolean[] inRange = map.withinRange(one, range[0], range[1]);
                for (int i = 0; i < inRange.length; i++) {
                    if (inRange[i]) {
                        System.out.println("<" + alphabet[alphaCount] + "> | Name: " + 
                                combatants[i].getName() + " | " + 
                                map.getLocation(i));
                        alphaCount++;
                    }
                }
                
                for (int i = 0; i < inRange.length; i++) {
                    System.out.println(inRange[i] + " | " + one);
                }
                attackBool = false;
            } else if ( attack == 'c') {
                attackBool = false;
            } else {
                System.out.println("Please choose a valid option.");
            }
        }
    }
    
    
    
    
    
    private boolean withinRange(int from, int to) {
        int[] range = combatants[from].getInventory().equipment.getRangedWeapon().getRange();
        int distance = map.getDistance(from, to);
        
        return (range[0] <= distance && distance <= range[1]);
            
    }
    
    public int rollInitiative(int combNum) {
        int mod = combatants[combNum].atributes.getModifier(1);
        
        return dice.rollDice(20, 1) + mod;
    }
    
    public void meleeAttack(Character atk, Character def) {
        int damage = 0;
        int range = map.getDistance(0, 1);
        
        if (range == 5) {
            if (atk.getInventory().equipment.meleeWeapon != null) {
                int atkAtri = atk.getInventory().equipment.meleeWeapon.getModifierAtribute();
                int atkMod = atk.atributes.getModifier(atkAtri);
                boolean wpnH = atk.getInventory().equipment.meleeWeapon.getHeavy();
                char atkSz = atk.race.getSize();

                int atkRoll;

                if ((wpnH) && (atkSz == 's')) {
                    atkRoll = dice.rollDisAdvantage(atkAtri);
                } else {
                    atkRoll = dice.rollDice(20, 1);
                }

                int defAC = def.getCharArmourClass();

                if (atkRoll == 1 || defAC > atkRoll + atkMod) {
                    damage = 0;
                } else {
                    damage = dice.rollDice(atk.getInventory().equipment.meleeWeapon.getDamageDice(), 1);
                }
            } else {
                /**
                 * for now unarmed damage is 1
                 * some classes does more, but for now it is 1
                 */
                damage = 1;
            }
        }
        printDamage(atk, def, damage);
        def.takeDamage(damage);
    }
    
    public void rangedAttack(Character atk, Character def) {
        
        
        int damage = 0;
        int range = map.getDistance(0, 1);
        int wepRange[] = atk.getInventory().equipment.rangedWeapon.getRange();
        
        if (wepRange[0] < range && range < wepRange[1]) {
            int atkAtri = atk.getInventory().equipment.rangedWeapon.getModifierAtribute();
            int atkMod = atk.atributes.getModifier(atkAtri);
            boolean wpnH = atk.getInventory().equipment.rangedWeapon.getHeavy();
            char atkSz = atk.race.getSize();

            int atkRoll;

            if ((wpnH) && (atkSz == 's')) {
                atkRoll = dice.rollDisAdvantage(atkAtri);
            } else {
                atkRoll = dice.rollDice(20, 1);
            }

            int defAC = def.getCharArmourClass();

            if (atkRoll == 1 || defAC > atkRoll + atkMod) {
                damage = 0;
            } else {
                damage = dice.rollDice(atk.getInventory().equipment.rangedWeapon.getDamageDice(), 1);
            }
        }
        printDamage(atk, def, damage);
        def.takeDamage(damage);
    }
    
    public void printDamage(Character atk, Character def, int damage) {
        System.out.println(atk.getName() + " does " + damage + 
                " damage to " + def.getName());
    }
}
