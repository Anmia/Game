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
    private int[][][] map;
    
    private int[][][] mapTwo = {{{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {1}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}, 
        {{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}}};
    
    private boolean endMovement = false;
    
     /**
      * 
      * @param map 
      * The map array is a 3d array and contains three "values"
      * The 2 first dimension are the x and y axis respectively
      * The third axis is information about the square
      */
//    public Maps (int[][][] map) {
//        this.map = map;
//    }
    
    
    private int xMap;
    private int yMap;

    public void printMap() {
        for (int i = 0; i < mapTwo.length; i++) {
            for (int j = 0; j < mapTwo[i].length; j++) {
                if (j == (mapTwo[i].length - 1)) {
                    System.out.print(" " + mapTwo[i][j][0]);
                    System.out.println();
                } else {
                    System.out.print(" " + mapTwo[i][j][0]);
                }
            }
        }
        
        System.out.println();
    }
    
    public void movePlayer(char direction) {
        locateChar();
        
        if (direction == 'n') {
            if (yMap > 0) {
                mapTwo[yMap][xMap][0] = 0;
                mapTwo[yMap - 1][xMap][0] = 1;
            } else {
                System.out.println("Cannot go north from " + xMap + "-" + yMap);
            }
        } else if (direction == 'e') {
            locateChar();
            if (!(xMap == mapTwo[xMap].length - 1)) {
                mapTwo[yMap][xMap][0] = 0;
                mapTwo[yMap][xMap + 1][0] = 1;
            } else {
                System.out.println("Cannot go east from " + xMap + "-" + yMap);
            }
        } else if (direction == 's') {
            locateChar();
            if (!(yMap == mapTwo.length - 1)) {
                mapTwo[yMap][xMap][0] = 0;
                mapTwo[yMap + 1][xMap][0] = 1;
            } else {
                System.out.println("Cannot go north from " + xMap + "-" + yMap);
            }
        } else if (direction == 'w') {
            locateChar();
            if (xMap > 0) {
                mapTwo[yMap][xMap][0] = 0;
                mapTwo[yMap][xMap - 1][0] = 1;
            } else {
                System.out.println("Cannot fo west from " + xMap + "-" + yMap);
            }
        } else if (direction == 'c') {
            endMovement = true;
        }
    }
    
    
    private void locateChar() {
        for (int i = 0; i < mapTwo.length; i++) {
            for (int j = 0; j < mapTwo[i].length; j++) {
                if (mapTwo[i][j][0] == 1)  {
                    xMap = j;
                    yMap = i;
                    
                    System.out.println(i + " | " + j);
                }
            }
        }
    }
    
    public boolean getEndMovement() {
        return endMovement;
    }
}
