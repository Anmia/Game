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
public abstract class Combat {
    private Character[] combatants;
    private int[][] locations;
    private Maps map;
    
    
    private int[][] combatOrder;
    private Dice dice = new Dice();
    
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public Combat(Character[] combatants, int[][] locations, Maps map) {
        this.combatants = combatants;
        this.locations = locations;
        this.map = map;
        createCombatants();
    }
    
    
    private void createCombatants() {
        for (int i = 1; i < combatants.length; i++) {
            combatants[i].createCharacter();
        }
    }
    
    public void setUpCombatMap(int leng) {
	map.setLength(leng);
        for (int i = 0; i < combatants.length; i++) {
            map.setInitialLocation(i, locations[i][0], locations[i][1], combatants[i].getIdentifyingChar());
        }
    }
    
    /**
     * Moves a Character on the combat map
     * @param i is which element in combatants array is going to move
     */
    public void combatMove(int i) {
        for (int j = combatants[i].race.getSpeed() / 5; j > 0; j--) {
            map.printMap();
            System.out.println("╔═╦═╦═╗");
	    System.out.println("║*║8║*║");
	    System.out.println("╠═╬═╬═╣");
	    System.out.println("║4║0║6║");
	    System.out.println("╠═╬═╬═╣");
	    System.out.println("║*║2║*║");
	    System.out.println("╚═╩═╩═╝");
	    System.out.println("you have " + j + " Moves left.");
            System.out.print("Insert direction for " + combatants[i].getName() + 
                    " using WASD to chose direction or E to end turn: ");

            int dir = sc.nextInt();
	    if (dir % 2 == 0 && dir < 10 || dir == 0) {
		map.movePlayer(i, dir);
		if (map.getEndMovement()) {
		    j = 0;
		} else if (map.getObstacle()) {
		    j = j + 1; 
		}
	    } else {
		System.out.println("Please choose a valid option");
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
        while (notEnd) {
            for (int hasTurn = 0; hasTurn < combatants.length; hasTurn++) {
                if (combatants[hasTurn].getCurentHealthPoints() > 0) {
                    for (int a = 0; a < combatants.length; a++) {
                        System.out.println(combatants[a].getName() + " " + combatants[a].printHealthStatus());
                        System.out.println(combatants[a].getName() + " " + combatants[a].getCurentHealthPoints());
                    }

                    map.printMap();

                    boolean actionBool = true;
                    while (actionBool) {

                        System.out.println("------------");
			System.out.println("< 0 > to move");
			System.out.println("< 1 > to attack");
			System.out.println("< 2 > to skip turn");
			System.out.println("< 3 > to cancel game (remove later)");
			System.out.print("Choose an action for " + combatants[hasTurn].getName() + 
				" (" + hasTurn + "): ");
                        int actChoice = sc.nextInt();

                        if (actChoice == 0) {
                            combatMove(hasTurn);
                            map.printMap();
                            boolean secChoiceBool = true;
                            while (secChoiceBool) {
				System.out.println("< 0 > Attack");
				System.out.println("< 1 > Don't attack");
                                System.out.print("please choose an option: ");

                                int secChoice = sc.nextInt();

                                if (secChoice == 0) {
                                    attack(hasTurn);
                                    secChoiceBool = false;
                                } else if (secChoice == 1) {
                                    secChoiceBool = false;
                                } else {
                                    System.out.println("Please choose a valid option.");
                                }
                            }
                            actionBool = false;
                        } else if (actChoice == 1) {
                            attack(hasTurn); 
                            boolean secChoiceBool = true;

                            while (secChoiceBool) {
				System.out.println("< 0 > Move");
				System.out.println("< 1 > stay where you are");
                                System.out.print("Do you wish to move?  0/1: ");

                                int secChoice = sc.nextInt();

                                if (secChoice == 0) {
                                    combatMove(hasTurn);
                                    secChoiceBool = false;
                                } else if (secChoice == 1) {
                                    secChoiceBool = false;
                                } else {
                                    System.out.println("Please choose a valid option: ");
                                }
                            }
                            actionBool = false;
                        } else if (actChoice == 2) {
                            actionBool = false;
                        } else if (actChoice == 3) {
                            notEnd = false;
                            actionBool = false;
                            hasTurn = combatants.length;
                        } else {
                            System.out.println("Please choose a valid option: ");
                        }
                    }
                }
                
                
                
            }
            
            boolean victory = true;
            for (int i = 1; i < combatants.length; i++) {
                if (combatants[i].getCurentHealthPoints() > 0) {
                    victory = false;
                }
            }
            
            if (victory) {
                notEnd = false;
            }
        }
    }
    
    /**
     * This needs work and needs to be cleaned up
     * It works though
     * Need to learn to comment properly!
     * @param hasTurn - character who has the turn, see combatFunction above
     */
    
    private void attack(int hasTurn) {
        boolean attackBool = true;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f'};
        while (attackBool) {
	    System.out.println("< 0 > for melee attack");
	    System.out.println("< 1 > for ranged attack");
	    System.out.println("< 2 > to cancel");
            System.out.print("Please choose an option: ");
            int attack = sc.nextInt();
            
            if (attack == 0) {
                int[] inRange = map.withinRange(hasTurn, 5, 5);
                
                for (int i = 0; i < inRange.length; i++) {
                    if (inRange[i] != 99) {
                        System.out.println("<" + alphabet[i] + "> | Name: " + 
                                combatants[i].getName() + " | " + 
                                map.getLocation(i));
                    }
                }
                
                boolean angryBool = true;
                while (angryBool) {
                    
                    
                    System.out.print("Choose target (or + to cancel): ");
                    char target = sc.next().charAt(0);
                    
                    int targetEnemy = 99;
                    
                    for (int i = 0; i < inRange.length; i++) {
                        if (inRange[i] != 99) {
                            if (target == alphabet[i]) {
                                targetEnemy = i;
                            }
                        }
                    }
                    
                    if (target == '+') {
                        angryBool = false;
                    } else if (targetEnemy == 99) {
                        System.out.println("Non valid target");
                    } else {
                        meleeAttack(combatants[hasTurn], combatants[targetEnemy], hasTurn, targetEnemy);
                        angryBool = false;
                        attackBool = false;
                    }
                }
            } else if (attack == 1) {
                int[] range = combatants[hasTurn].getInventory().equipment.getRangedWeapon().getRange();
                int[] inRange = map.withinRange(hasTurn, range[0], range[1]);
                
                for (int i = 0; i < inRange.length; i++) {
                    if (inRange[i] != 99) {
                        System.out.println("<" + alphabet[i] + "> | Name: " + 
                                combatants[i].getName() + " | " + 
                                map.getLocation(i));
                    }
                }
                
                boolean angryBool = true;
                while (angryBool) {
                    System.out.print("Choose target (or + to cancel): ");
                    char target = sc.next().charAt(0);
                    
                    int targetEnemy = 99;
                    
                    for (int i = 0; i < inRange.length; i++) {
                        if (inRange[i] != 99) {
                            if (target == alphabet[i]) {
                                targetEnemy = i;
                            }
                        }
                    }
                    
                    if (target == '+') {
                        angryBool = false;
                    } else if (targetEnemy == 99) {
                        System.out.println("Non valid target");
                    } else {
                        rangedAttack(combatants[hasTurn], combatants[targetEnemy], hasTurn, targetEnemy);
                        angryBool = false;
                        attackBool = false;
                    }
                }
            } else if ( attack == 2) {
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
        int mod = combatants[combNum].getAtributes().getModifier(1);
        
        return dice.rollDice(20, 1) + mod;
    }
    
    public void meleeAttack(Character atk, Character def, int hasTurn, int target) {
        int damage = 0;
        int range = map.getDistance(hasTurn, target);
        
        if (range == 5) {
            if (atk.getInventory().equipment.meleeWeapon != null) {
                int atkAtri = atk.getInventory().equipment.meleeWeapon.getModifierAtribute();
                int atkMod = atk.getAtributes().getModifier(atkAtri);
                boolean wpnH = atk.getInventory().equipment.meleeWeapon.getHeavy();
                char atkSz = atk.race.getSize();

                int atkRoll;

                if ((wpnH) && (atkSz == 's')) {
                    atkRoll = dice.rollDisAdvantage(atkAtri);
                } else {
                    atkRoll = dice.rollDice(20, 1);
                }

                int defenderArmourClass = def.getCharArmourClass();

                if (atkRoll == 1 || defenderArmourClass > atkRoll + atkMod) {
                    damage = 0;
                } else {
                    damage = dice.rollDice(atk.getInventory().equipment.meleeWeapon.getDamageDice(), 1);
                }
            } else {
                /**
                 * for now unarmed damage is 1
                 * some classes does more, but for now it is 1
                 */
                System.out.println("NO");
                damage = 1;
            }
        }
        printDamage(atk, def, damage);
        def.takeDamage(damage);
    }
    
    /**
     *
     * @param atk the attacker
     * @param def the target
     * @param hasTurn the array position the attacker has
     * @param target the array position the target has
     */
    public void rangedAttack(Character atk, Character def, int hasTurn, int target) {
        int damage = 0;
        int range = map.getDistance(hasTurn, target);
        int wepRange[] = atk.getInventory().equipment.rangedWeapon.getRange();
        
        int atkAtri = atk.getInventory().equipment.rangedWeapon.getModifierAtribute();
        int atkMod = atk.getAtributes().getModifier(atkAtri);
        boolean wpnH = atk.getInventory().equipment.rangedWeapon.getHeavy();
        char atkSz = atk.race.getSize();
        int atkRoll;
        int defenderArmourClass = def.getCharArmourClass();
        if (range <= wepRange[0]) {
            

            if ((wpnH) && (atkSz == 's')) {
                atkRoll = dice.rollDisAdvantage(atkAtri);
            } else {
                atkRoll = dice.rollDice(20, 1);
            }

            if (atkRoll == 1 || defenderArmourClass > atkRoll + atkMod) {
                damage = 0;
            } else {
                damage = dice.rollDice(atk.getInventory().equipment.rangedWeapon.getDamageDice(), 1);
            }
        } else if (wepRange[0] < range) {
            atkRoll = dice.rollDisAdvantage(atkAtri);
            
            if (atkRoll == 1 || defenderArmourClass > atkRoll + atkMod) {
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
