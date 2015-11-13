//
//CSE002
//Duc Ngo
//HW10
//
//
//This program simulates the Mine Sweeper game
//It first asks user to declare a size of the board
//Then ask for a number of mines to be planted
//The output will then show a square map with where the mines have been planted
//as well as how many mines are adjacent to a given empty cell

import java.util.Scanner;

public class MineSweeper{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 2 and 30 as the size of the board: ");
        int n = scanner.nextInt();
        while (n<2 || n>30) {
            System.out.print("Please enter an integer between 2 and 30 as the size of the board: ");
            n = scanner.nextInt();
        }
        char[][] board = new char[n][n]; //we set up the size of the board with this array declaration
        int m=0;
        while (m<1 || m> (n*n)) {
            System.out.print("Please enter an integer between 1 and " + n*n + " as the size of the board: ");
            m = scanner.nextInt();
        }
        int i=0;
        while (i<m) { //this while loop is used to plant mines
            int plantbombX = (int)(Math.random()*n);
            int plantbombY = (int)(Math.random()*n);
            if (board[plantbombX][plantbombY] != 'M') { //the if statement prevents mines from being planted twice in the same cell
                board[plantbombX][plantbombY] = 'M';
                i++;
            }
        }
        int[][] boardcheck = new int[n+2][n+2]; //this int array will be used to tally up the number of mines adjacent to a given cell
        //we used the [n+2] array size to avoid out of bound situation; the outermost layer will be hidden in the output
        for (int a=1; a<(n+1); a++) {
            for (int b=1; b<(n+1); b++) { //the 2 for loops runs through every array cell
                if (board[a-1][b-1] == 'M') { //the if statement helps tally up the counter on boardcheck
                    boardcheck[a-1][b-1] += 1;
                    boardcheck[a][b-1] += 1;
                    boardcheck[a-1][b] += 1;
                    boardcheck[a-1][b+1] += 1;
                    boardcheck[a+1][b+1] += 1;
                    boardcheck[a][b+1] += 1;
                    boardcheck[a+1][b] += 1;
                    boardcheck[a+1][b-1] += 1;
                }
            }
        }
        
        String[][] boardvisual = new String[n+2][n+2]; //a string array is used here due to the combinatin of characters and numbers
        for (int x=1; x<(n+1);x++) {
            for (int y=1; y<(n+1);y++) {
                if (board[x-1][y-1] == 'M') { //if else statements to import either letter M or boardcheck counter into the visualboard matrix
                    boardvisual[x][y] = "M";
                }
                else boardvisual[x][y] = Integer.toString(boardcheck[x][y]);
            }
        }
        
        for (int c=1; c<(n+1); c++) { //this for loop is used to print out the result
            for (int d=1; d<(n+1);d++) {
                System.out.print(boardvisual[c][d] + " ");
            }
            System.out.println(" ");
        }
    }
}