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
public class Ranged_Dart extends Ranged{
    private static final int itemID = 12002;
    private static final String name = "Dart";
    
    private static final boolean towHanded = false;
    private static final int damageDice = 4;
    private static final int[] range = {20, 60};
    private static final char damageType = 'p';
    private static final boolean heavy = false;
    
    public Ranged_Dart() {
        super(itemID, name, towHanded, damageDice, range, damageType, heavy);
    }
}
