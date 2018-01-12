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
    private long storyStep;
    
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
