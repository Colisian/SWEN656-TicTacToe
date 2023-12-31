package org.example;

public class TicTacToe {

    public char[][] board;
    private char currentPlayer;

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public TicTacToe(){
        board = new char[3][3];
        currentPlayer = 'X';
        createBoard();
    }

    public void play(int row, int column){
        board[row][column] = currentPlayer;
        displayBoard();
        //Flip player from X to O after each successful move.
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    public boolean gameWin(){
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-'){
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-' ){
                return true;
            }
        }
        //check diagonal
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        return false;
    }
    public boolean gameTie() {
        //All positions are filled with either an X or O and no win
        if(!gameWin()) {
            for(int i =0; i<3;i++) {
                for (int j = 0; j<3; j++) {
                    if(board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true; // Tie happened
        }
        return false; // No Tie happened
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
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        GameBoard gb = new GameBoard(game);
        gb.startGame();
    }
}