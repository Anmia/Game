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
    
    private char[][][] mapTwo = {{{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}, 
        {{'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}, {'+'}}};
    
    private boolean endMovement = false;
    private boolean endCombat = false;
    
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
    
    private char[] charSymbol = new char[10];
    
    private int[][] characterLocations = new int[10][2];
    
    private boolean obstacle = true;

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
    
    
    
    public void movePlayer(int who, char direction) {
//        System.out.print("Insert direction for Nr.1 using WASD: ");
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//        char direction = sc.next().charAt(0);
        endMovement = false;
        
        char name = charSymbol[who];
        
        int x = characterLocations[who][0];
        int y = characterLocations[who][1];
        obstacle = true;
        
        if (direction == 'w') {
            if (!(y > 0)) {
                    System.out.println("Cannot go north from " + x + "-" + y);
                } else if (checkSquare(x, y - 1)){
                    System.out.println("Cannot go north from " + x + "-" + y +
                            " beacuse something is in the way.");
                } else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y - 1][x][0] = name;
                    characterLocations[who][1] = y - 1;
                    obstacle = false;
                }
        } else if (direction == 'd') {
            if (x == mapTwo[x].length - 1) {
                    System.out.println("Cannot go east from " + x + "-" + y);
                } else if (checkSquare(x + 1, y)){
                    System.out.println("Cannot go east from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y][x + 1][0] = name;
                    characterLocations[who][0] = x + 1;
                    obstacle = false;
                }
        } else if (direction == 's') {
            if (y == mapTwo.length - 1) {
                    System.out.println("Cannot go south from " + x + "-" + y);
                } else if (checkSquare(x, y + 1)){
                    System.out.println("Cannot go south from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y + 1][x][0] = name;
                    characterLocations[who][1] = y + 1;
                    obstacle = false;
                }
        } else if (direction == 'a') {
            if (!(x > 0)) {
                    System.out.println("Cannot go west from " + x + "-" + y);
                } else if (checkSquare(x - 1, y)){
                    System.out.println("Cannot go west from " + x + "-" + y +
                            " beacuse something is in the way.");
                }  else {
                    mapTwo[y][x][0] = '+';
                    mapTwo[y][x - 1][0] = name;
                    characterLocations[who][0] = x - 1;
                    obstacle = false;
                }
        } else if (direction == 'e') {
            endMovement = true;
        } else if (direction == 'c') {
            endMovement = true;
            endCombat = true;
        }
    }
    
    
    public void locateChar(char ident) {
        
             
        for (int i = 0; i < mapTwo.length; i++) {
            for (int j = 0; j < mapTwo[i].length; j++) {
                if (mapTwo[i][j][0] == ident)  {
                    System.out.println("X: " + j + " | Y: " + i);
                }
            }
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
            if (mapTwo[checkY][checkX][0] == obstacles[i]) {
                ocupied = true;
            }
        }
        
        return ocupied;
    }
    
    public void getXY() {
        System.out.println("[ " + characterLocations[0][0] + " | " + characterLocations[0][1] + " ]");
    }
    
    public void setInitialLocation(int who, int x, int y, char symbol) {
        characterLocations[who][0] = x;
        characterLocations[who][1] = y;
        
        mapTwo[y][x][0] = symbol;
        charSymbol[who] = symbol;
    }
    
    public boolean getEndCombat() {
        return endCombat;
    }
}
