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
public class Story {
    private int storyStep = 0;
    private int location;
    
    private Character player;
    
    private String toPrint;
    public Text_Dump txtDmp = new Text_Dump();
    
    private int[] optVal = new int[20];
    private String[] optName = new String[20];
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    public Story(Character player) {
        this.player = player;
        
        optName[17] = "View Equiptment";
        optName[18] = "View Inventory";
        optName[19] = "End Game";
    }
    
    public String getWarning() {
        String warning = "There is a real chance that any attempt at playing this game might fail. \n"
                + "This game uses D&D combat, meaning that dice are used and \n"
                + "that damage given and taken are, within set paramaters, random. \n"
                + "Think of it as rougelike, just kind of oposite. \n"
                + "This game features and will feature some language that may make children ask questions that adults may find akward. \n"
                + "This game is not completed as of yet! \n"
                + " ";
        
        return warning;
    }
    
    public void storyPrint() {
        int i = 0;
        switch(storyStep) {
            case 0: 
                toPrint = "!! INSTRUCTIONS !!\n"
                        + "Congratulations, you are now playing Krohnhagen Adventures! "
                        + "This game is text heavy and uses text graphics. As such you should change your output font to a monospace font. "
                        + "To do anything in this game you will need a keyboard. A promt will apear to inform you of your options. It is case sensetive!!! "
                        + "For the time being you start the game as a CN dwarf fighter. "
                        + "Are you ready to start your adventure or do you want to save it for later? "
                        + "y for yes and q to save it for later";
                optVal[0] = 1;
                optName[0] = "Continue";
                for (i = 1; i < optVal.length - 3; i++) {
                    optVal[i] = -1;
                    optName[i] = null;
                }
                break;
            case 1:
                toPrint = "It has been almost three weeks since you signed up as a caravan guard."
                        + "You have spent most of your time sitting on a hard wooden seat and it is starting to smart."
                        + "";
                optVal[0] = 2;
                optName[0] = "Continue";
                for (i = 1; i < optVal.length - 3; i++) {
                    optVal[i] = -1;
                    optName[i] = null;
                }
                break;
                
            case 2:
                toPrint = "";
                break;
                
            case 3:
                break;
                
            case 4:
                Combat com = new Combat_FirstBattle(player);
                com.combatFunction();
                break;
                
            default: 
                toPrint = "ERROR!"; 
                break;
        }
        
    }
    
    
    private void wrapper() {
        StringBuilder sb = new StringBuilder(toPrint);
        
        int i = 0;
        while (i + 60 < sb.length() && (i = sb.lastIndexOf(" ", i + 60)) != -1) {
            sb.replace(i, i + 1, "\n");
        }
        
        System.out.println(sb.toString());
    }
    
    public void tempProgressStory() {
        storyStep = storyStep + 1;
    }
    
    /**
     * The story begins as you are on your way to Krohnhagen
     * Less than a day out you are "ambushed" by Goblins (COMBAT)
     * Once you defeat these goblins or (if possible 10 - 15 turns) Anna appears
     * Attempting to attack her will make the bush attack (COMBAT)
     * It is the shit
     * Skeggulgt will say he thinks he might know who she is
     * She follows the caravan to Krohnhagen (maybe find goblin camp?)
     * Upon ariving in Krohnhagen
     */
    
    public void storyFunk() {
        boolean chooseOption = true;
        while (chooseOption) {
            storyPrint();
            wrapper();
            for (int i = 0; i < optVal.length; i++) {
                if (optName[i] != null) {
                    System.out.println("< " + i + " > " + optName[i]);
                }
            }


            System.out.print("Please choose an option: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 17:
                    player.getInventory().getEquipment().printeEuipment();
                    break;
                case 18:
                    player.getInventory().backpack.printBackpack();
                    break;
                case 19:
                    chooseOption = false;
            }            
            
            if (optVal[choice] == -1) {
                System.out.println("Please choose a valid option");
            } else {
                storyStep = optVal[choice];
            }
            
            
            
        }
    }
}
