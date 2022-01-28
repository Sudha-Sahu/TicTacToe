package com.Bridgelabz.TicTacToeGame;
import java.util.*;


public class TicTacToeGame{

	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe game!!! ");
		System.out.println(" ");
		
			createBoard();
	}
	public static void createBoard() {

		char[] tic = new char[10];
		for(int i=1;i<10;i++) {
			tic[i]=' ';
		}
		
	}
}