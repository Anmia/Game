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
    
    private int baseHealthPoints;
    private int curentHealthPoints;
    
    private int level;
    private int alignment;
    private int charArmourClass;
    private char identifyingChar;
    
    
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
            Inventory inventory, Atributes atributes, int baseHealthPoints, 
            int level, int alignment, char identifyingChar) {
        this.name = name;
        this.race = race;
        this.proffesion = proffesion;
        this.inventory = inventory;
        this.atributes = atributes;
        this.baseHealthPoints = baseHealthPoints;
        this.level = level;
        this.alignment = alignment;
        this.identifyingChar = identifyingChar;
        
        charArmourClass = setArmourClass();
        createCharacter();
        curentHealthPoints = baseHealthPoints;
    }
    
    private void createCharacter() {
        for (int i = 0; i < atributes.atributesBase.length; i++) {
            atributes.setCharacterCreationBase(i, race.getRaceModifiers(i));
        }
        baseHealthPoints = proffesion.getHitDice() + atributes.getModifier(2);
    }
    
    private int setArmourClass() {
        int ac = inventory.equipment.armour.getAC();
        int mod = atributes.getModifier(1);
        int newAc = 0;
        
        switch(inventory.equipment.armour.getArmourType()) {
            case 1: 
                newAc = ac + mod; break;         
            case 2:
                 if (mod > 2) {
                    newAc = ac + 2;
                } else {
                    newAc = ac + mod;
                } break;
                
            case 3:
                newAc = ac; break;
        }
        
        return newAc;
    }
    
    public String getName() {
        return name;
    }
    
    public int getBaseHealthPoints() {
        return baseHealthPoints;
    }
    
    public int getCurentHealthPoints() {
        return curentHealthPoints;
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
    
    
    
    public void levelUp() {
        System.out.println("Your hit dice is: " + proffesion.getHitDice() + 
                ". Your basic HP increase is: " + proffesion.getChoiceHitDice());
        System.out.print("Type Y to throw dice, type N for default increase.");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char choice = sc.next().charAt(0);
        
        level = level + 1;
        Dice dice = new Dice();
        
        switch (choice) {
            case 'y': 
                baseHealthPoints = baseHealthPoints + dice.rollDice(proffesion.getHitDice(), 1) + atributes.getModifier(3); break;
            case 'n': 
                baseHealthPoints = baseHealthPoints + proffesion.getChoiceHitDice() + atributes.getModifier(3); break;
        }
        
        System.out.println("Your new HP is: " + baseHealthPoints);
    }
    
    
    
    
    public char getIdentifyingChar() {
        return identifyingChar;
    }
    
    public boolean getProficiency() {
        return true;
    }
    
//    private String name;
//    protected Race race;
//    private Proffesion proffesion;
//    protected Inventory inventory;
//    protected Atributes atributes;
//    private int healthPoints;
//    private int level;
//    private int alignment;
//    private int charArmourClass;
//    private char identifyingChar;
    
    @Override
    public String toString(){
        return "Name: " + name + " | Level: " + level + 
                " | Proffesion: " + proffesion.getProffesionName() + "\n" + 
                "Armour : " + inventory.equipment.armour.getName() + 
                " | Melee Weapon: " + inventory.equipment.meleeWeapon.getName() + 
                " | Ranged Weapon: " + inventory.equipment.rangedWeapon.getName() + "\n";
    }
    
    
}