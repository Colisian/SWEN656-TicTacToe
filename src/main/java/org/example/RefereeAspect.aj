package org.example;

public aspect RefereeAspect{
    //Define the joining point for the gameMove() method in the TicTacToe class
    pointcut gameMove(int row, int column): execution(* TicTacToe.play(int,int)) && target(game)
            && args(row, column);

    after(int row, int column) returning: gameMove(row, column{
        TicTacToe game = (TicTacToe) thisEnclosingJoinPointStaticPart.getTarget();
        game.displayBoard();

        if(game.gameWin()){
            System.out.println("Player " + game.getCurrentPlayer() + " loses!");
            System.exit(0);
        } else if (game.gameTie()){
            System.out.println("It is a tie");
            System.exit(0);
        }
    }
}