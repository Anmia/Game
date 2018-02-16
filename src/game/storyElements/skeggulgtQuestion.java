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
                optName[1] = "The duchy of Krohnhagen";
		
		optVal[8] = 20;
                optName[8] = "You're good";
		
		break;
		
	    case 2:
		toPrint = "";
		break;
		
	    case 3:
		toPrint = "";
		break;
	    
	    case 4:
		toPrint = "";
		break;
	    
	    case 5: 
		toPrint = "";
		break;
	
	    case 6:
		toPrint = "";
		break;
	
	    case 7:
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
