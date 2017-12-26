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


public abstract class Character {
    private String name;
    private Race race;
    private Proffesion proffesion;
    private Inventory inventory;
    private Atributes atributes;
    private int healthPoints;
    private int level;
    private int alignment;
    private int charArmourClass;
    
    
    /**
     * 
     * @param name String
     * @param race (see race)
     * @param inventory (see inventory) (needs work)
     * @param atributes (see atributes)
     * @param healthPoints
     * @param level
     * @param alignment 
     */
    
    public Character (String name, Race race, Proffesion proffesion, 
            Inventory inventory, Atributes atributes, int healthPoints, 
            int level, int alignment) {
        this.name = name;
        this.race = race;
        this.proffesion = proffesion;
        this.inventory = inventory;
        this.atributes = atributes;
        this.healthPoints = healthPoints;
        this.level = level;
        this.alignment = alignment;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealthPoints() {
        return healthPoints;
    }
    
    public int getLevel() {
        return level;
    }
    
    public int getAlignment() {
        return alignment;
    }
    
    public String getAlignmentName() {
        String name = "";
        switch(alignment) {
            case 11: name = "Lawful Good"; break;
            case 12: name = "Neutral Good"; break;
            case 13: name = "Chaotic Good"; break;
            case 21: name = "Lawful Neutral"; break;
            case 22: name = "Neutral Neural"; break;
            case 23: name = "Chaotic Neutral"; break;
            case 31: name = "Lawful Evil"; break;
            case 42: name = "Neutral Evil"; break;
            case 53: name = "Chaotic Evil"; break;
        }
        return name;
    }
    
    /**
     * For checking if something can be used (item)
     */
    
    public boolean checkUse(Weapon weapon) {
        int atribute = atributes.getAtribute(weapon.getReqAtribute());
        
        return (atribute < weapon.getReqLevel());
    }
    
    public int rollInitiative() {
        Dice dice = new Dice();
        
        return dice.rollDice(20, 1) + atributes.getModifier(1);
    }
    
    public int rollAdvantage(int atribute) {
        Dice dice = new Dice();
        
        int one = dice.rollDice(20, 1);
        int two = dice.rollDice(20, 1);
        
        if (one < two) {
            return two;
        } else if (one > two) {
            return one;
        } else {
            return one;
        }
    }
    
    public int rollDisAdvantage(int atribute) {
        Dice dice = new Dice();
        
        int one = dice.rollDice(20, 1);
        int two = dice.rollDice(20, 1);

        if (one > two) {
            return two;
        } else if (one < two) {
            return one;
        } else {
            return one;
        }
    }
    
    public int rollAttack(Character enemy) {
        int enemyAC;
        
        if (enemy.inventory.equipment.getShield()) {
            enemyAC = enemy.inventory.equipment.armour.getAC() + 2;
        } else {
            enemyAC = enemy.inventory.equipment.armour.getAC();
        }
        
        Dice dice = new Dice();
        int attackRoll;
        
        if (proffesion.checkProficiency(inventory.equipment.weapon.getItemID())) {
            attackRoll = dice.rollDice(20, 1) + 
                atributes.getModifier(inventory.equipment.
                        weapon.getModifierAtribute() + 2);
        } else {
            attackRoll = dice.rollDice(20, 1) + 
                atributes.getModifier(inventory.equipment.
                        weapon.getModifierAtribute());
        }
        
        
        
        if (enemyAC <= attackRoll) {
            int wD = inventory.equipment.weapon.getDamageDice();

            int damage = dice.rollDice(wD, 1) + 
                    atributes.getModifier(inventory.equipment.weapon.getModifierAtribute());

            if (damage < 0) {
                return 0;
            } else {
                return damage;
            }
        } else {
            return 0;
        }  
    }
    
    public void createCharacter() {
        for (int i = 0; i < atributes.atributesBase.length; i++) {
            atributes.setCharacterCreationBase(i, race.getRaceModifiers(i));
        }
        
        healthPoints = proffesion.getHitDice() + atributes.getModifier(2);
    }
    
    public void levelUp() {
        Dice dice = new Dice();
        healthPoints = healthPoints + dice.rollDice(proffesion.getHitDice(), 1);
    }
    
    public void setCharArmourClass() {
        
        if (inventory.equipment.armour.getDexMod()) {
            
            if (inventory.equipment.armour.getArmourType() == 2) {
                
                if (atributes.getModifier(1) > 2) {
                    charArmourClass = inventory.equipment.armour.getAC() + 2;
                } else {
                    charArmourClass = inventory.equipment.armour.getAC() + 
                            atributes.getModifier(1);
                }
                
            } else {
                charArmourClass = inventory.equipment.armour.getAC() + 
                        atributes.getModifier(1);
            }
            
        } else {
            charArmourClass = inventory.equipment.armour.getAC();
        }
    }
    
}