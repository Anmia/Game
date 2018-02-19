/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.storyElements;

/**
 * Still needs work
 * @author Magnus
 */
public class SkeggulgtQuestion {
    private int step = 0;
    private String toPrint;
    
    private int[] optVal = new int[10];
    private String[] optName = new String[10];
    
    private boolean duchess[] = {false, false};
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    
    public SkeggulgtQuestion() {
	optName[9] = "Cancel (remove later)";
        
        fluffFunc();
    }
    
    private void fluffFunc() {
	boolean proceed = true;
        
	
        while (proceed) {
            fluffText();
            wrapper();
	    
	    System.out.println("\n");
	    if (step == 20) {
		proceed = false;
	    } else {
		for (int i = 0; i < optVal.length; i++) {
		    if (optName[i] != null) {
			System.out.println("< " + i + " > " + optName[i]);
		    }
		}

		System.out.print("Please choose an option: ");
		int choice = sc.nextInt();
		if (choice > 9) {
		    System.out.println("Please choose a valid option");
		} else {
		    if (choice == 9) {
			proceed = false;
		    } else if (optVal[choice] == -1) {
			System.out.println("Please choose a valid option");
		    }else {
			step = optVal[choice];
		    }
		}
	    }
	    
            
            
        }
    }
    
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
	for (int i = 0; i < optVal.length - 1; i++) {
            optVal[i] = -1;
            optName[i] = null;
        }
    }
    
    private void fluffText() {
	wiper();
        switch (step) {
            case 0: 
                toPrint = "\"We should be less than a day away from Krohnhagen now,\" "
			+ "Skeggulgt says just as you are about to doze off. "
			+ "\" If we are lucky we will be there before the gates "
			+ "close for the evening,\" he continues, speaking louder "
			+ "than strictly necessary. "
			+ "After a few moments Skeggulgt nudges you with his "
			+ "foot. \"How much do you know about Krohnhagen?\" he asks.";
              
                optVal[0] = 1;
                optName[0] = "Almost nothing";
                
		optVal[1] = 20;
                optName[1] = "I know enough (skips fluff)";
                break;
		
	    case 1: 
		toPrint = "\"Well, what do you want to know more about?\" "
			+ "Skeggeulgt asks.";
		
		optVal[0] = 2;
		optName[0] = "Skeggulgt";
		
		optVal[1] = 3;
                optName[1] = "Krohnhagen";
		
		optVal[8] = 20;
                optName[8] = "You're good";
		break;
		
	    case 2:
		toPrint = "Skeggulgt barks out a laugh. \"You want to know more "
			+ "about me! I am charmed!\" he chuckles. He tells you "
			+ "he once worked as a guard in the town of Krohnhagen, "
			+ "managing to rise as far as captain. After the death "
			+ "of the former duchess and the failed attempt on the "
			+ "current duchess's life by her father, Skeggulgt left "
			+ "the guard to become a caravan guard. For one reason "
			+ "or another he seems to think he changed to a safer job.";
		
		optVal[0] = 1;
		optName[0] = "That wasn't much, but fair enough.";
		break;

	    case 3:
		toPrint = "\"The town or the duchy?\" Skeggulgt asks. He "
			+ "chuckles to himself in a way that tells you this is "
			+ "not the first time he asks the question.";
		
		optVal[0] = 4;
		optName[0] = "The town";
		
		optVal[1] = 5;
                optName[1] = "The duchy";
		
		optVal[2] = 7;
                optName[2] = "The difference";
		
		if (duchess[0] && duchess[1]) {
		    optVal[3] = 8;
		    optName[3] = "The Duchess";
		}
		
		optVal[4] = 1;
                optName[4] = "Never mind";
		break;
	    
	    case 4:
		toPrint = "\"The town is where we are heading,\" Skeggulgt says "
			+ "matter-of-factly. He tell you about how it was built "
			+ "on top of what is thought to be an ancient fortress. "
			+ "Long ago it started to outgrow the confines of the "
			+ "fortress that had been its foundations and main "
			+ "source of building material. It spread in all "
			+ "directions, even managing to straddle the river "
			+ "Jeker. Despite being the largest city in the duchy "
			+ "of Krohnhagen, it is still referred to as a town. The "
			+ "reason behind this is thought to be mostly habit, "
			+ "but also the cost of changing all the stationary. "
			+ "The town is where the duchess and most of the nobles "
			+ "in Krohnhagen have their residences. The town has a "
			+ "diverse population, whatever that means.";
		duchess[1] = true;
		optVal[0] = 3;
                optName[0] = "Weird";
		break;
	    
	    case 5: 
		toPrint = "\"Ah, yes...\" Skeggulgt says with a smile. He tell "
			+ "you about how the duchy is an independent one. The "
			+ "duchy has always been ruled by the duchess. It covers "
			+ "the lands east of The Rolling Hills to the desserts "
			+ "in the west, and from the coast to the Blunted Razors "
			+ "in the north. The duchy is well off, but any attempt "
			+ "to take it over has usually resulted in failure. This "
			+ "has famously been due to the people of Krohnhagen "
			+ "simply ignoring invaders until they either appologize "
			+ "or leave.";
		
		duchess[0] = true;
		
		optVal[0] = 3;
		optName[0] = "Odd";
		
		optVal[1] = 6;
		optName[1] = "OWLBEAR!";
		break;
		
	    case 6: 
		toPrint = "Skeggulgt gives you a blank stare. The stare tells "
			+ "you that it's not that it isn't funny, but that it "
			+ "might be true.";
		
		optVal[0] = 3;
		optName[0] = "Oops!";
		break;
		
	    case 7:
		toPrint = "\"Indeed there is,\" Skeggulgt says. He tells you "
			+ "that no one knows if one was named after the other "
			+ "or if they both were named after something else "
			+ "entirely.";
		
		optVal[0] = 3;
		optName[0] = "Fair enough";
		break;
	
	    case 8:
		/**
		 * talk about duchess and inheritance here
		 */
		toPrint = "";
		optVal[0] = 3;
		optName[0] = "Oops!";
		break;
	    
	    case 20: 
		toPrint = "\"Well, if you say so,\" Skeggulgt says ";
		break;
	    default: 
		toPrint = "Error!";
		break;
        }
    }
}
