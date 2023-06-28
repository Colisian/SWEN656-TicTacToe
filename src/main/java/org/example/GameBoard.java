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
            System.out.println("Player " + game.getCurrentPlayer() + " enter your move by first entering row and then column");
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            if (row >= 0 && row < 3 && column >=0 && column < 3 && game.board[row][column] == '-'){
                game.play(row,column);
            } else {
                System.out.println("Invalid move");
            }
        }
        displayBoard();
        scanner.close();
    }
    private void displayBoard(){
        game.displayBoard();
    }
}
