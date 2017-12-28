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
    
    private char[][][] mapTwo = {{{'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'~'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'+'}, {'+'}, {'+'}, {'+'}, {'@'}, {'+'}, {'+'}, {'+'}, {'+'}, {'¤'}}, 
        {{'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}, {'¤'}}};
    
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
    
    private int[][] characterLocations = {{15,5}, {3,3}};
    
    private int x;
    private int y;

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
    
    public void movePlayer(char direction, int who) {
        
        locateChar(who);
        
        char name = '9';
        
        switch(who) {
            case 0: name = '@'; break;
            case 1: name = '~'; break;
        }
        
        switch (direction) {
            case 'w':
                if (!(y > 0)) {
                    System.out.println("Cannot go north from " + x + "-" + y);
                } else if (mapTwo[y - 1][x][0] == '¤' || mapTwo[y - 1][x][0] == '~' || mapTwo[y - 1][x][0] == '@'){
                    System.out.println("Cannot go north from " + x + "-" + y +
                            " beacuse something is in the way.");
                } else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y - 1][x][0] = name;
                }   break;
            case 'd':
                
                if (x == mapTwo[x].length - 1) {
                    System.out.println("Cannot go east from " + x + "-" + y);
                } else if (mapTwo[y][x + 1][0] == '¤' || mapTwo[y][x + 1][0] == '~' || mapTwo[y][x + 1][0] == '@'){
                    System.out.println("Cannot go east from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y][x + 1][0] = name;
                }   break;
            case 's':
                if (y == mapTwo.length - 1) {
                    System.out.println("Cannot go south from " + x + "-" + y);
                } else if (mapTwo[y + 1][x][0] == '¤' || mapTwo[y + 1][x][0] == '~' || mapTwo[y + 1][x][0] == '@'){
                    System.out.println("Cannot go south from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y + 1][x][0] = name;
                }   break;
            case 'a':
                if (!(x > 0)) {
                    System.out.println("Cannot fo west from " + x + "-" + y);
                } else if (mapTwo[y][x - 1][0] == '¤'|| mapTwo[y][x - 1][0] == '~' || mapTwo[y][x - 1][0] == '@'){
                    System.out.println("Cannot go west from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y][x - 1][0] = name;
                }   break;
            case 'c':
                endMovement = true;
                break;
            default:
                break;
        }
    }
    
    
    private void locateChar(int who) {
        switch(who) {
            case 0: 
                for (int i = 0; i < mapTwo.length; i++) {
                    for (int j = 0; j < mapTwo[i].length; j++) {
                        if (mapTwo[i][j][0] == '@')  {
                            characterLocations[who][0] = j;
                            characterLocations[who][1] = i;
                            x = characterLocations[who][0];
                            y = characterLocations[who][1];
                        }
                    }
                } break;
            case 1: 
                for (int i = 0; i < mapTwo.length; i++) {
                    for (int j = 0; j < mapTwo[i].length; j++) {
                        if (mapTwo[i][j][0] == '~')  {
                            characterLocations[who][0] = j;
                            characterLocations[who][1] = i;
                            x = characterLocations[who][0];
                            y = characterLocations[who][1];
                        }
                    }
                } break;
        }
        
        
    }
    
    public boolean getEndMovement() {
        return endMovement;
    }
}
