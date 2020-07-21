package com.luv2code.snakeAndLaader;

import java.util.Scanner;

public class Game {

	public static void main(String ab[]) {
		 Scanner s=new Scanner(System.in);
	Player player=new Player();
	
	FirstPlayer firstPlayer = new FirstPlayer();
	
	GameBoard gameBoard=new GameBoard();
	String[][] board;
	System.out.println("Snake and Ladder Game................................!!!!!!!!!");
	System.out.println("Enter FirstPlayer Name...............");
	System.out.println(".................");
	String firstPlayr = s.next();
	firstPlayer.setPlayerName(firstPlayr);
	System.out.println("Welcome to the  game"+" "+firstPlayr);
	System.out.println("Enter FirstPlayer Name...............");
	System.out.println(".................");
	String secondplayer=s.next();
	player.setPlayerName(secondplayer);
	player.setRowPosition(0);
	player.setColumnPosition(0);
	
	firstPlayer.setRowPosition(0);
	firstPlayer.setColumnPosition(0);
	
	 board=gameBoard.createBoard(player, firstPlayer);
	
    gameBoard.printBoard(board);	
   
     boolean won=false;
    while(!won) {
    	System.out.println("First Player Turn");
    	System.out.println("--------------------------------------------");
    	System.out.println("Type 1 to throw dice");
    	System.out.println("--------------------------------------------");
    	int play = s.nextInt();
    	if(play==1) {
    		  int max = 6; 
    	        int min = 1; 
    	        int range = max - min + 1; 
    	int moves =(int) (Math.random()*range)+min;
    	System.out.println("You got "+moves);
    	System.out.println("--------------------------------------------");
    	gameBoard.firstPlayerMove(moves,board,firstPlayer);
    	System.out.println("Your new postion is");
    	System.out.println("--------------------------------------------");
    	board = gameBoard.createBoard(player, firstPlayer);
    	gameBoard.printBoard(board);
    	  if(checkforWin(board,player,firstPlayer)) {
 	        	won =true;
 	        	break;
 	        }
    	
    	
    	}
    	System.out.println("Second player Turn!!");
    	System.out.println("--------------------------------------------");
    	System.out.println();
    	System.out.println("Type 2 to throw dice");
    	System.out.println("--------------------------------------------");
    	int secondPlay = s.nextInt();
    	if(secondPlay==2) {
    		   int min = 1;
    		   int max=6;
   	        int range = max - min + 1; 
   	        int moves =(int) (Math.random()*range)+min;
   	        System.out.println("You got "+moves);
   	     System.out.println("--------------------------------------------");
   	        gameBoard.SecondPlayerMove(moves,board,player);
   	        System.out.println("Your new postion is");
   	     System.out.println("--------------------------------------------");
   	        board = gameBoard.createBoard(player, firstPlayer);
   	        gameBoard.printBoard(board);
   	        if(checkforWin(board,player,firstPlayer)) {
   	        	won =true;
   	        	break;
   	        }
   	     
   	}
    }
    
	}

	private static boolean checkforWin(String[][] board,Player player,FirstPlayer firstPlayer) {
		// TODO Auto-generated method stub
		if((player.getRowPosition()==9)&&(player.getColumnPosition()==9)) {
			System.out.println(player.getPlayerName()+" "+" Won the game");
			System.out.println("--------------------------------------------");
			System.out.println("------------------END--------------------------");
			System.out.println("--------------------------------------------");
			return true;
		}
		else if((firstPlayer.getColumnPosition()==9)&&(firstPlayer.getRowPosition()==9)) {
			System.out.println(firstPlayer.getPlayerName()+" "+"Won the game");
			System.out.println("--------------------------------------------");
			System.out.println("------------------END--------------------------");
			System.out.println("--------------------------------------------");
			return true;
		}
		return false;
	}
}

