package org.example;

import java.util.Scanner;

public class GameBoard {
    private TicTacToe game;
    private Scanner scanner;

    public GameBoard(TicTacToe game){
        this.game = game;
        this.scanner = new Scanner(System.in);
    }
    public void startGame(){
        //Displays board as long as game has not been completed
        while (!game.gameWin() && !game.gameTie()){
            displayBoard();
        }
    }
    private void displayBoard(){
        game.displayBoard();
    }
}
