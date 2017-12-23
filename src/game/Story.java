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
    
    protected String storyone = " The story starts \n"
            + "You are traveling with a caravan towards the city of Krohnhagen";
}
