package com.Bridgelabz.TicTacToeGame;
import java.util.*;


public class TicTacToeGame{

	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe game!!! ");
		System.out.println(" ");
		createBoard();
		chooseXorO();
	}
	public static void createBoard() {

		char[] tic = new char[10];
		for(int i=1;i<10;i++) {
			tic[i]=' ';
		}

	}
	public static String chooseXorO() {

		Scanner sc = new Scanner(System.in);
		char player , computer;
		System.out.print("Input letter X or O for player : ");
		player = sc.next().charAt(0);
		if(player == 'X' || player == 'x')
			computer = 'O';
		else if(player == 'O' || player == 'o')
			computer = 'X';
		else
			System.out.println("Invalid inputs");
		return null;
	}
}