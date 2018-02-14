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
public class skeggulgtQuestion {
    private int step = 0;
    private String toPrint;
    
    private int[] optValue = new int[10];
    private String[] optName = new String[10];
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    
    public skeggulgtQuestion() {
	optValue[9] = 9;
        
        fluffFunc();
    }
    
    private void fluffFunc() {
	boolean proceed = true;
        
        while (proceed) {
            fluffText();
            
            for (int i = 0; i < optValue.length; i++) {
                if (optName[i] != null) {
                    System.out.println("< " + i + " > " + optName[i]);
                }
            }
            
            System.out.println("Please choose an option: ");
            int choice = sc.nextInt();
            
            if (optValue[choice] == -1) {
                System.out.println("Please choose a valid option");
            } else {
                step = optValue[choice];
            }
        }
    }
    
    private void fluffText() {
        switch (step) {
            case 0: 
                toPrint = "\"So my friend, have you ever been to Krohnhagen before?\"";
                
                
                break;
        }
    }
}
