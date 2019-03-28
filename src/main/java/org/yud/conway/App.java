package org.yud.conway;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row = scanner.nextInt();
		System.out.println("Enter the number of columns:");
		int col = scanner.nextInt();
		ConwayGame game = new ConwayGame();
		int[][] init = intializeBoard(row, col);
		game.setConwayBoard(init);
		displayBoard(init);
		/*********************************************/
		/**
		 * we can add below two lines of code in an infinite loop, for the board to keep on 
		 * generation next states
		 * we can add a human intervention ,like an input from the user to stop the
		 * game or also we can ask user to enter the number of states
		 * he would like the game to generate
		 */
		game.iterateThroughTheBoard();
		displayBoard(game.getConwayBoard());
		/*********************************************/
	}
	
	/**
	 * this method initializes the conway game board
	 * a random number generator has been used to fill the board
	 * but we can use scanner to get the input from user or i/o to read
	 * from a file for initial state
	 * @param row
	 * @param col
	 * @return
	 */
	public static int[][] intializeBoard(int row, int col) {
		//initializing the size of the board
		int[][] init = new int[row][col];
		/* 
		 * getting input from user for cell values
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 0 or 1 only.");
		for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		
        		System.out.println("Enter 0 or 1 as value for row:"+i+" and col:"+j);
        		init[i][j] = scanner.nextInt(2);
        	}
        }
		return init;
	}
	/**
	 * This method is used to display the board
	 * to see the state
	 * @param board
	 */
	public static void displayBoard(int[][] board) {
		for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[0].length;j++) {
        		System.out.print(board[i][j]);
        	}
        	System.out.println();
        }
	}

}
