/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Here the combat maps will be stored as arrays
 * maps are squares for now, maybe hexes in the future
 * @author Magnus
 */
public class Maps {
    protected int[][][] map;
    
     /**
      * 
      * @param map 
      * The map array is a 3d array and contains three "values"
      * The 2 first dimension are the x and y axis respectively
      * The third axis is information about the square
      */
    public Maps (int[][][] map) {
        this.map = map;
    }
    

    public void printMap() {
        for (int i = 0; i < map[i].length; i++) {
            for (int j = 0; i < map[i][j].length; j++) {
                
            }
        }
    }
}
