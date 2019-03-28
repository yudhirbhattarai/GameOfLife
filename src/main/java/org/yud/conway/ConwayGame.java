package org.yud.conway;

public class ConwayGame {

	private int[][] conwayBoard;
	public int[][] getConwayBoard() {
		return conwayBoard;
	}

	public void setConwayBoard(int[][] conwayBoard) {
		this.conwayBoard = conwayBoard;
	}


	/**
	 * This method traverses through the board checking for living and dead
	 * conditions for each cell
	 */
	public void iterateThroughTheBoard() {
		for (int i = 0; i < conwayBoard.length; i++) {
			for (int j = 0; j < conwayBoard[0].length; j++) {
				int count = getLiveNeighboursCount(i,j);
				/*if the cell satisfies living condition
				 * then it continues being alive or becomes alive in next state
				 * else its dead
				 */
				if(checkForDeathOrAliveConditionOfCell(count, conwayBoard[i][j])) {
					conwayBoard[i][j]=1;
				}else {
					conwayBoard[i][j]=0;
				}
			}
		}
	}
	/**
	 * This method fetches the count of the live neighbours
	 * for a cell based on the below condition:
	 * A cell’s neighbors are those cells which are horizontally, vertically or
	 *	diagonally adjacent. Most cells will have eight neighbors. Cells placed on the
	 *	edge of the grid will have fewer.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	private int getLiveNeighboursCount(int i,int j) {
				int count =0;
				int row = conwayBoard.length;
				int col = conwayBoard[0].length;
				if(i+1 < row && conwayBoard[i+1][j] ==1) {
					count++;
				}
				if(j+1 < col && conwayBoard[i][j+1] ==1) {
					count++;
				}
				if(j+1 < col &&i+1<row && conwayBoard[i+1][j+1] ==1) {
					count++;
				}
				if(i-1 >= 0 && conwayBoard[i-1][j] ==1) {
					count++;
				}
				if(j-1 >= 0 && conwayBoard[i][j-1] ==1) {
					count++;
				}
				if(i-1 >=0 && j-1 >=0 && conwayBoard[i-1][j-1] ==1) {
					count++;
				}
				if(i-1 >=0 && j+1 <col && conwayBoard[i-1][j+1] ==1) {
					count++;
				}
				if(i+1 <row && j-1 >=0 && conwayBoard[i+1][j-1] ==1) {
					count++;
				}
				return count;
        	
	}
	
	/**
	 * This method checks if a cell will be dead or alive in the next state
	 * and returns true if it will be alive and returns false otherwise.
	 * @param count
	 * @param cellValue
	 * @return
	 */
	public boolean checkForDeathOrAliveConditionOfCell(int count,int cellValue) {
		if(cellValue ==0 && count == 3) {
			return true;
		}
		if(cellValue ==1 && (count ==2 || count == 3)) {
			return true;
		}
		return false;
	}
}
