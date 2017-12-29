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
    protected Race race;
    private Proffesion proffesion;
    protected Inventory inventory;
    protected Atributes atributes;
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
        
        setArmourClass();
    }
    
    private void setArmourClass() {
        charArmourClass = 0;
        Armour tempArmour = inventory.equipment.armour;
        
        if (tempArmour.getArmourType() == 3) {
            if (atributes.getAtribute(tempArmour.getReqAtribute()) < tempArmour.getReqLevel()) {
                System.out.println("Can not don selected armour");
            } else {
                charArmourClass = tempArmour.getAC();
            }
        } else if (tempArmour.getArmourType() == 2) {
            if (atributes.getModifier(1) > 2) {
                charArmourClass = tempArmour.getAC() + 2;
            } else {
                charArmourClass = tempArmour.getAC() + atributes.getModifier(1);
            }
        } else if (tempArmour.getArmourType() == 1) {
            charArmourClass = tempArmour.getAC() + atributes.getModifier(1);
        }
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
    
    public int getCharArmourClass() {
        return charArmourClass;
    }
    
    /**
     * For checking if something can be used (item)
     */
    
    public boolean checkUse(Armour armour) {
        int atribute = atributes.getAtribute(armour.getReqAtribute());
        
        return (atribute >= armour.getReqLevel());
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
        int ac = inventory.equipment.armour.getAC();
        int mod = atributes.getModifier(1);
        
        switch(inventory.equipment.armour.getArmourType()) {
            case 1: 
                charArmourClass = ac + mod; break;
                            
            case 2:
                 if (mod > 2) {
                    charArmourClass = ac + 2;
                } else {
                    charArmourClass = ac + mod;
                } break;
                
            case 3:
                charArmourClass = ac; break;
        }
    }
    
    public void changeWeapon(Weapon weapon) {
        this.inventory.equipment.setWeapon(weapon);
        System.out.println("Success!");
    }
    
}