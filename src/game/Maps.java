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
    
    private char[][][] mapTwo = {{{'@'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}, {'¤'}, {'¤'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}, {'¤'}, {'¤'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}};
    
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
    
    private int[] characterLocations;
    
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
        
        if (direction == 'w') {
            if (!(yMap > 0)) {
                System.out.println("Cannot go north from " + xMap + "-" + yMap);
            } else if (mapTwo[yMap - 1][xMap][0] == '¤'){
                System.out.println("Cannot go north from " + xMap + "-" + yMap + " beacuse an obastacle is in the way.");
            } else {
                mapTwo[yMap][xMap][0] = '+';
                mapTwo[yMap - 1][xMap][0] = '@';
            }
        } else if (direction == 'd') {
            locateChar();
            if (xMap == mapTwo[xMap].length - 1) {
                System.out.println("Cannot go east from " + xMap + "-" + yMap);
            } else if (mapTwo[yMap][xMap + 1][0] == '¤'){
                System.out.println("Cannot go east from " + xMap + "-" + yMap + " beacuse an obastacle is in the way.");
            }  else {
                mapTwo[yMap][xMap][0] = '+';
                mapTwo[yMap][xMap + 1][0] = '@';
            }
        } else if (direction == 's') {
            locateChar();
            if (yMap == mapTwo.length - 1) {
                System.out.println("Cannot go south from " + xMap + "-" + yMap);
            } else if (mapTwo[yMap + 1][xMap][0] == '¤'){
                System.out.println("Cannot go south from " + xMap + "-" + yMap + " beacuse an obastacle is in the way.");
            }  else {
                mapTwo[yMap][xMap][0] = '+';
                mapTwo[yMap + 1][xMap][0] = '@';
            }
        } else if (direction == 'a') {
            locateChar();
            if (!(xMap > 0)) {
                System.out.println("Cannot fo west from " + xMap + "-" + yMap);
            } else if (mapTwo[yMap][xMap - 1][0] == '¤'){
                System.out.println("Cannot go west from " + xMap + "-" + yMap + " beacuse an obastacle is in the way.");
            }  else {
                mapTwo[yMap][xMap][0] = '+';
                mapTwo[yMap][xMap - 1][0] = '@';
            }
        } else if (direction == 'c') {
            endMovement = true;
        }
    }
    
    
    private void locateChar() {
        for (int i = 0; i < mapTwo.length; i++) {
            for (int j = 0; j < mapTwo[i].length; j++) {
                if (mapTwo[i][j][0] == '@')  {
                    xMap = j;
                    yMap = i;
                }
            }
        }
    }
    
    public boolean getEndMovement() {
        return endMovement;
    }
}
