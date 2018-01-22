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
    private int storyStep;
    private int location;
    private String toPrint;
    public Text_Dump txtDmp = new Text_Dump();
    
    public String getWarning() {
        String warning = "There is a real chance that any attempt at playing "
                + "this game might fail. \n"
                + "This game uses D&D combat, meaning that dice are used and "
                + "that damage given and taken are, "
                + "within set paramaters, random. \n "
                + "Think of it as rougelike, just kind of oposite. \n"
                + "This game is not completed as of yet!";
        
        return warning;
    }
    
    private String story = "You are bored and your arse is sore. "
            + "A little over two weeks ago you signed up as ";
    
    public String storyPrint() {
        switch(storyStep) {
            case 0: 
                toPrint = "!! INSTRUCTIONS !! +n"
                        + "Congratulations, you are now playing Krohnhagen Adventures! \n"
                        + "This game is text heavy and uses text graphics. \n"
                        + "As such you should change your output font to a monospace font. \n"
                        + "To do anything in this game you will need a keyboard. A promt will apear \n"
                        + "to inform you of your options. It is case sensetive!!! \n \n"
                        + "For the time being you start the game as a CN dwarf fighter. \n \n"
                        + "Are you ready to start your adventure or do you want to save it for later? \n"
                        + "y for yes and q to save it for later";
                
            case 1:
                toPrint = "It has been almost three weeks since you signed up as a caravan guard";
        }
        
        return "Hello";
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
}
