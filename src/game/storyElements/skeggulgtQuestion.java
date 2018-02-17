/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.storyElements;

/**
 *
 * @author Magnus
 */
public class SkeggulgtQuestion {
    private int step = 0;
    private String toPrint;
    
    private int[] optVal = new int[10];
    private String[] optName = new String[10];
    
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
			+ "Skeggulgt says just as you are about todoze off. "
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
			+ "current duchees's life by her father, Skeggulgt left "
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
		
		optVal[3] = 1;
                optName[3] = "Never mind";
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
			+ "of Krohnhagen, it is still refered to as a town. The "
			+ "reason behind this is thought to be mostly habit, "
			+ "but also the cost of changing all the stationary. "
			+ "The town is where the duchess and most of the nobles "
			+ "in Krohnhagen have their residences. The town has a "
			+ "diverse population, whatever that means.";
		
		optVal[0] = 3;
                optName[0] = "Weird";
		break;
	    
	    case 5: 
		toPrint = "\"Ah, yes...\" Skeggulgt says with a smile, \"The "
			+ "most glorious duchy of Krohnhagen.\" He hums a quick "
			+ "tune and starts giving you ";
		
		optVal[0] = 3;
		optName[0] = "";
		
		optVal[0] = 6;
		optName[0] = "";
		break;
		
	    case 6: 
		toPrint = "";
		
		optVal[0] = 3;
		optName[0] = "";
		break;
		
	    case 7:
		toPrint = "\"Indeed there is,\" Skeggulgt says. He goes on to "
			+ "tell you that no one knows if one was named after "
			+ "the other or if they both were named after something "
			+ "else entirely.";
		
		optVal[0] = 3;
		optName[0] = "Fair enough";
		break;
	
	    case 8:
		toPrint = "";
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
