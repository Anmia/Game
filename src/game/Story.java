/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.storyElements.SkeggulgtQuestion;


/**
 * This one is going to be massive. 
 * @author Magnus
 */
public class Story {
    private int storyStep = 0;
    private int location;
    
    private boolean gameOver = false;
    
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
    
    
    public void storyFunk() {
        while (!gameOver) {
            storyPrint();
            wrapper();
            
	    if (!gameOver) {
		System.out.println("\n");
		for (int i = 0; i < optVal.length; i++) {
		    if (optName[i] != null) {
			System.out.println("< " + i + " > " + optName[i]);
		    }
		}
		System.out.print("Please choose an option: ");
		int choice = sc.nextInt();

		if (choice > 19) {
		    System.out.println("Please choose a valid option");
		} else {
		    switch (choice) {
			case 17:
			    player.getInventory().getEquipment().printEuipment();
			    break;
			case 18:
			    player.getInventory().backpack.printBackpack();
			    break;
			case 19:
			    gameOver = true;
		    }            

		    if (optVal[choice] == -1) {
			System.out.println("Please choose a valid option");
		    } else {
			storyStep = optVal[choice];
		    }
		}
	    }
	    
        }
    }
    
    /**
     * The Wrapper is copied from
     * https://stackoverflow.com/a/4212726
     */
    
    private void wrapper() {
        StringBuilder sb = new StringBuilder(toPrint);
        
        int i = 0;
        while (i + 80 < sb.length() && (i = sb.lastIndexOf(" ", i + 80)) != -1) {
            sb.replace(i, i + 1, "\n");
        }
        
	System.out.println("\n");
        System.out.println(sb.toString());
	
    }
    
    private void wiper() {
	for (int i = 0; i < optVal.length - 3; i++) {
            optVal[i] = -1;
            optName[i] = null;
        }
    }
    
    public void storyPrint() {
        wiper();
        switch(storyStep) {
            case 0: 
                toPrint = "!! INSTRUCTIONS !!\n"
                        + "Congratulations, you are now playing Krohnhagen Adventures! "
			+ "This game is text heavy and uses text graphics. As "
			+ "such you should change your output font to a monospace "
			+ "font. If you are unable to do so the game is still "
			+ "playable, but not as enjoyable.To do anything in this "
			+ "game you will need a keyboard. A promt will apear to "
			+ "inform you of your options. It is case sensetive!!! "
			+ "For the time being you start the game as a CN dwarf "
			+ "fighter. Are you ready to start your adventure or do "
			+ "you want to save it for later?";
		
                optVal[0] = 1;
                optName[0] = "Continue";
                break;
            case 1:
                toPrint = "It has been almost three weeks since you signed up as "
			+ "a caravan guard back in Golat. The caravan is not a "
			+ "large one and only has two wagons. Most of your time "
			+ "has been spent riding in the back of the first wagon "
			+ "together Skeggulgt, the only other guard hired by the "
			+ "caravan master, watching the scenery go by, some of "
			+ "it you grudgingly admit is rather nice. The weather "
			+ "is nice and you get paid either way if something "
			+ "happens or not, so you don’t really mind.";
		
                optVal[0] = 2;
                optName[0] = "Continue";
                break;
                
            case 2:
		/**
		 * Will try to introduce ability checks her later on, but for 
                 * now the check is assumed a success
		 */
                toPrint = "Oddly enough you feel that time has somehow stood "
			+ "still as you talked with Skeggulgt.";
		
		SkeggulgtQuestion fluffy = new SkeggulgtQuestion();
		
		optVal[0] = 3;
                optName[0] = "Odd";
                break;
                
            case 3:
		toPrint = "As you come around a bend in the road you hear a "
			+ "rather colourful curse from the wagon driver. "
			+ "Moments later the wagon comes to a halt. Curious "
			+ "about what is going on you get out of the wagon. "
			+ "Looking out from behind it you see two leather clad "
			+ "figures standing on either side of the road. At "
			+ "Skeggulgt’s advice you take a look behind you and "
			+ "see two more figures stepping out of the forest to "
			+ "block any retreat. \"You take the two in front and "
			+ "I’ll deal with the two in the back,\" Skeggulgt "
			+ "tells you. You give a grunt in agreement and ready "
			+ "your weapons as you walk to the front of the wagon.";
		
		optVal[0] = 4;
                optName[0] = "Finaly some action!";
                break;
                
            case 4:
                Combat com = new Combat_FirstBattle(player);
                gameOver = com.combatFunction();
		
				if(gameOver) {
					toPrint = "As your life leaves your body you regret not "
						+ "listening to your mother. She told you that, even if "
						+ "it was less exciting than becoming an adventurer, "
						+ "becoming a stone-mason would have provided a steady "
						+ "income. Now your mother has lost her last child, but "
						+ "will never know. Her face apears in your vision and "
						+ "you feebly try to cry out just as darkness engulfs "
						+ "you. GAME OVER";
				} else {
					combatEnd(50);
				}
		
		optVal[0] = 5;
                optName[0] = "Continue";
                break;
	    case 5:
		toPrint = "Sam apears ++";
		
		optVal[0] = 5;
                optName[0] = "Stare at her";
		
		optVal[1] = -2;
                optName[1] = "Try to kill her";
		
		break;
	    case 6:
		toPrint = "6";
		optVal[0] = 5;
                optName[0] = "Continue";
		
		break;
	    case 7:
		toPrint = "7";
		optVal[0] = 5;
                optName[0] = "Continue";
		
		break;
	    case 8:
		toPrint = "8";
		optVal[0] = 5;
                optName[0] = "Continue";
		
		break;
	    case 9:
		toPrint = "9";
		optVal[0] = 10;
                optName[0] = "Continue";
		
		break;
	    case 10:
		toPrint = "10";
		optVal[0] = 5;
                optName[0] = "Continue";
		
		break;
	    /**
	     * Currently all values less than 0 are game overs.
	     * These will mostly be customised to how you died and will show 
	     * stats. Might move to its own class for readability
	     * MOVE TO OWN CLASS!
	     */ 
	    case -2:
		toPrint = "The girl throws the bush at you. The las thing you "
			+ "feel before your life leaves you is a scathing pain "
			+ "as the bush rips your head from your body. GAME OVER";
		gameOver = true;
		break;
            default: 
                toPrint = "ERROR! You have reached the end of the story for now "
			+ "or managed something really weird."; 
                break;
        }
        
    }
    
	private void combatEnd(int xp) {
		int lvl = player.getLevel();
		player.setExp(xp);
		System.out.println("You gained " + xp + "xp, your new xp is " + player.getExp());
		if (lvl < player.getLevel()) {
			System.out.println("You gained a level. You are now level " + player.getLevel());
		}
		
	}
}
