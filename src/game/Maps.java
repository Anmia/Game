/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * Here the combat maps will be stored as arrays
 * maps are squares for now, maybe hexes in the future
 * doubt it though
 * @author Magnus
 */
public class Maps {
    private char[][][] map;
    
    public void setMap(char[][][] map) {
        this.map = map;
    }
    
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
    
    private char[] obstacles = {'¤'};
    
    private char[] charSymbol = new char[3];
    
    private int[][] charLocations = new int[3][2];
    
    private boolean obstacle = true;

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (j == (map[i].length - 1)) {
                    System.out.print(" " + map[i][j][0]);
                    System.out.println();
                } else {
                    System.out.print(" " + map[i][j][0]);
                }
            }
        }
        
        System.out.println();
    }
    
    
    
    public void movePlayer(int who, char direction) {
        endMovement = false;
        
        char name = charSymbol[who];
        
        int x = charLocations[who][0];
        int y = charLocations[who][1];
        obstacle = true;
        
        if (direction == 'w') {
            if (!(y > 0)) {
                    System.out.println("Cannot go north from " + x + "-" + y);
                } else if (checkSquare(x, y - 1)){
                    System.out.println("Cannot go north from " + x + "-" + y +
                            " beacuse something is in the way.");
                } else {
                    map[y][x][0] = '.';
                    map[y - 1][x][0] = name;
                    charLocations[who][1] = y - 1;
                    obstacle = false;
                }
        } else if (direction == 'd') {
            if (x == map[x].length - 1) {
                    System.out.println("Cannot go east from " + x + "-" + y);
                } else if (checkSquare(x + 1, y)){
                    System.out.println("Cannot go east from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    map[y][x][0] = '.';
                    map[y][x + 1][0] = name;
                    charLocations[who][0] = x + 1;
                    obstacle = false;
                }
        } else if (direction == 's') {
            if (y == map.length - 1) {
                    System.out.println("Cannot go south from " + x + "-" + y);
                } else if (checkSquare(x, y + 1)){
                    System.out.println("Cannot go south from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    map[y][x][0] = '.';
                    map[y + 1][x][0] = name;
                    charLocations[who][1] = y + 1;
                    obstacle = false;
                }
        } else if (direction == 'a') {
            if (!(x > 0)) {
                    System.out.println("Cannot go west from " + x + "-" + y);
                } else if (checkSquare(x - 1, y)){
                    System.out.println("Cannot go west from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    map[y][x][0] = '.';
                    map[y][x - 1][0] = name;
                    charLocations[who][0] = x - 1;
                    obstacle = false;
                }
        } else if (direction == 'e') {
            endMovement = true;
        } 
    }
    
    
    
    
    public boolean getObstacle() {
        return obstacle;
    }
    
    public boolean getEndMovement() {
        return endMovement;
    }
    
    public boolean checkSquare(int checkX, int checkY) {
        boolean ocupied = false;
        
        for (int i = 0; i < obstacles.length; i++) {
            if (map[checkY][checkX][0] == obstacles[i]) {
                ocupied = true;
            }
        }
        
        for (int i = 0; i < charLocations.length; i++) {
            if (charLocations[i][0] == checkX && charLocations[i][1] == checkY) {
                ocupied = true;
            }
        }
        
        return ocupied;
    }
    
    public void printCoordinates() {
        System.out.println("[ " + charLocations[0][0] + " | " + charLocations[0][1] + " ]");
    }
    
    public void setInitialLocation(int who, int x, int y, char symbol) {
        charLocations[who][0] = x;
        charLocations[who][1] = y;
        
        map[y][x][0] = symbol;
        charSymbol[who] = symbol;
    }
    
    public int[] withinRange(int who, int min, int max) {
        boolean[] checker = new boolean[charSymbol.length];
        int[] inRange = new int[charSymbol.length];
        
        for (int i = 0; i < charSymbol.length; i++) {
            if (min >= getDistance(who, i) && 0 != getDistance(who, i)) {
                checker[i] = true;
            } else {
                checker[i] = false;
            }
        }
        
        for (int i = 0; i < checker.length; i++) {
            if (checker[i]) {
                inRange[i] = i;
            } else {
                inRange[i] = 99;
            }
        }
        
        return inRange;
    }
    
    public int getDistance(int from, int to) {
        int distance = 0;
        
        for (int i = 0; i < 2; i++) {
            int m = charLocations[from][i];
            int n = charLocations[to][i];
            
            if (n < m) {
                distance = distance + (m - n);
            } else {
                distance = distance + (n - m);
            }
        }
        
        return distance * 5;
    }
    
    public void removeCharacter(int who) {
        map[charLocations[who][1]][charLocations[who][0]][0] = '.';
    }
    
    public String getLocation(int who) {
        return charLocations[who][0] + "/" + charLocations[who][1];
    }
    
    
}
