package org.example;

public class TicTacToe {

    private char[][] board;
    private char currentPlayer;

    public TicTacToe(){
        board = new char[3][3];
        currentPlayer = 'X';
        createBoard();
    }


    //Uses for loops to establish the game board
    public void createBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';

            }
        }
    }

    public void displayBoard(){
        System.out.println("Current Board");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}