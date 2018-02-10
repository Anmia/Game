/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


/**
 * This one is going to be massive. 
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
    
    /**
     * https://stackoverflow.com/a/4212726
     */
    
    private void wrapper() {
        StringBuilder sb = new StringBuilder(toPrint);
        
        int i = 0;
        while (i + 60 < sb.length() && (i = sb.lastIndexOf(" ", i + 80)) != -1) {
            sb.replace(i, i + 1, "\n");
        }
        
	System.out.println("\n");
        System.out.println(sb.toString());
	System.out.println("\n");
    }
    
    public void tempProgressStory() {
        storyStep = storyStep + 1;
    }
    
    public void storyPrint() {
        int i = 0;
        switch(storyStep) {
            case 0: 
                toPrint = "!! INSTRUCTIONS !!\n"
                        + "Congratulations, you are now playing Krohnhagen Adventures! "
                        + "This game is text heavy and uses text graphics. As such you should change your output font to a monospace font. If you are unable to do so the game is still playable, but not as enjoyable."
                        + "To do anything in this game you will need a keyboard. A promt will apear to inform you of your options. It is case sensetive!!! "
                        + "For the time being you start the game as a CN dwarf fighter. "
                        + "Are you ready to start your adventure or do you want to save it for later?";
		
                optVal[0] = 1;
                optName[0] = "Continue";
                for (i = 1; i < optVal.length - 3; i++) {
                    optVal[i] = -1;
                    optName[i] = null;
                }
                break;
            case 1:
                toPrint = "It has been almost three weeks since you signed up as"
			+ " a caravan guard back in Golat. The fact that some of the scenery was "
			+ "rather nice does not make up for the pain in your arse. "
			+ "The caravan is not a large one and only has two carts. "
			+ "Most of your time has been spent riding in the back of the "
			+ "first cart together Skeggulgt, the only other guard hired by "
			+ "the caravan master.";
		
                optVal[0] = 2;
                optName[0] = "Continue";
                for (i = 1; i < optVal.length - 3; i++) {
                    optVal[i] = -1;
                    optName[i] = null;
                }
                break;
                
            case 2:
                toPrint = "";
		
		optVal[0] = 3;
                optName[0] = "Continue";
                for (i = 1; i < optVal.length - 3; i++) {
                    optVal[i] = -1;
                    optName[i] = null;
                }
                break;
                
            case 3:
		toPrint = "";
		
		optVal[0] = 4;
                optName[0] = "Continue";
                for (i = 1; i < optVal.length - 3; i++) {
                    optVal[i] = -1;
                    optName[i] = null;
                }
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
    

}
