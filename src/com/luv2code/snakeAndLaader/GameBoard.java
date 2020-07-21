package com.luv2code.snakeAndLaader;

import java.util.HashMap;

public class GameBoard {

	private String[][] board=new String[10][10];
	
	private HashMap<Integer,Integer>snake = new HashMap<>();
	private HashMap<Integer,Integer>ladder = new HashMap<>();
	
	
	
	
	public String[][] createBoard(Player player,FirstPlayer firstPlayer) {
	String[][] board=new String[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				board[i][j]="0";
				if(((i==player.getRowPosition())&&(j==player.getColumnPosition())) && ((i==firstPlayer.getRowPosition()&&(j==firstPlayer.getColumnPosition())))) {
					board[i][j]=player.getPlayerName()+" "+firstPlayer.getPlayerName();
				}
				else if(((i==player.getRowPosition())&&(j==player.getColumnPosition()))) {
					
					
					
					board[i][j]=player.getPlayerName();
				}
				else if((i==firstPlayer.getRowPosition()&&(j==firstPlayer.getColumnPosition()))){
					board[i][j]=firstPlayer.getPlayerName();
				}
			}
				
		}
	snake.put(76, 28);
	snake.put(48,4);
	ladder.put(4, 75);
	ladder.put(26, 94);
		return board;
	}
	
	public void printBoard(String[][] board) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print("("+" "+board[i][j]+" "+")"+" ");
			}
			System.out.println();
		}
	}

	public void firstPlayerMove(int moves,String[][] board,FirstPlayer firstPlayer) {
		int row =firstPlayer.getRowPosition();
		int column = firstPlayer.getColumnPosition();
		if(column+moves>9) {
			int temp=9-column;
			row+=1;
			column=0;
			column=moves-temp;
		}
		else {
			column=column+moves;
		}
		
		int position = ((row+1)*10)+column+1;
		if(snake.containsKey(position)) {
			int newPosition=snake.get(position);
			row=(newPosition/10)-1;
			column=(newPosition%10)-1;
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("got Bitten By snake");
			System.out.println("--------------------------------------------");
			System.out.println("----------------------SNAKE---------------------");
			System.out.println("--------------------------------------------");
		}
		else if(ladder.containsKey(position)) {
			int newPosition = ladder.get(position);
			row = (newPosition/10)-1;
			column=(newPosition%10)-1;
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			
			System.out.println("Moved up in a ladder");
			System.out.println("--------------------------------------------");
			System.out.println("-----------------------LADDER---------------------");
			System.out.println("--------------------------------------------");
		}
		if(row>9) {
			System.out.println("--------------------------------------------");
			System.out.println("Cant move");
			System.out.println("--------------------------------------------");
		}
		else {
		firstPlayer.setRowPosition(row);
		firstPlayer.setColumnPosition(column);
		}
	}
	public void SecondPlayerMove(int moves,String[][] board,Player firstPlayer) {
		int row =firstPlayer.getRowPosition();
		int column = firstPlayer.getColumnPosition();
		if(column+moves>9) {
			int temp=9-column;
			row+=1;
			column=0;
			column=moves-temp;
		}
		else {
			column=column+moves;
		}
		int position = ((row+1)*10)+column+1;
		if(snake.containsKey(position)) {
			int newPosition=snake.get(position);
			row=(newPosition/10)-1;
			column=(newPosition%10)-1;
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("got Bitten By snake");
			System.out.println("--------------------------------------------");
			System.out.println("----------------------SNAKE---------------------");
			System.out.println("--------------------------------------------");
		}
		else if(ladder.containsKey(position)) {
			int newPosition = ladder.get(position);
			row = (newPosition/10)-1;
			column=(newPosition%10)-1;
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			
			System.out.println("Moved up in a ladder");
			System.out.println("--------------------------------------------");
			System.out.println("-----------------------LADDER---------------------");
			System.out.println("--------------------------------------------");
		}
		if(row>9) {
			System.out.println("--------------------------------------------");
			System.out.println("Cant move");
			System.out.println("--------------------------------------------");
		}
		else {
		firstPlayer.setRowPosition(row);
		firstPlayer.setColumnPosition(column);
		}
	}
}
