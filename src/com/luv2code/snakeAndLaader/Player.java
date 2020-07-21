package com.luv2code.snakeAndLaader;

public class Player {
	
	public Player() {
		
	}
	
	public String playerName;
	
	private int rowPosition;
	
	private int columnPosition;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getRowPosition() {
		return rowPosition;
	}

	public void setRowPosition(int rowPosition) {
		this.rowPosition = rowPosition;
	}

	public int getColumnPosition() {
		return columnPosition;
	}

	public void setColumnPosition(int columnPosition) {
		this.columnPosition = columnPosition;
	}
	
	

}
