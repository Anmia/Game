/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author nerdi
 */
public class Melee_Handaxe extends Melee {
    private final static long itemID = 11004;
    private final static String name = "Handaxe";
    
    private final static boolean twoHanded = false;
    private final static int damageDice = 6;
    
    private final static boolean reach = false;

    public Melee_Handaxe() {
        super(itemID, name, twoHanded, damageDice, reach);
    }
}
