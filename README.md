# SWEN656-TicTacToe
**Overview**
The TicTacToe game is a Java console application that allows two players to play the classic game of Tic-Tac-Toe. It provides a simple and interactive interface where players can take turns marking X or O on a 3x3 grid. The game keeps track of the moves, determines the winner, and handles tie scenarios. The system is implemented using the AspectJ framework, which enables the application of aspect-oriented programming (AOP) concepts.

# Features
- Two-player gameplay: Two players can take turns marking X or O on the game board.
- In-terminal Game board display: The game board is displayed after each move to show the current state of the game.
- Win detection: The game detects when a player wins by getting three marks in a row, column, or diagonal.
- Tie detection: If all cells on the game board are filled without a winner, the game is declared a tie.
- Aspect-Oriented Programming: The game utilizes AspectJ to implement cross-cutting concerns, such as game state validation and displaying the game board.

# AspectJ and AOP
AspectJ is a powerful extension of the Java programming language that enables developers to apply aspect-oriented programming techniques. AOP aims to modularize cross-cutting concerns, which are functionalities that cut across multiple modules or components of an application. In the TicTacToe game, AspectJ is used to separate the concerns of game state validation and game board display from the core game logic.

The RefereeAspect class in the system serves as an aspect that intercepts the gameMove method in the TicTacToe class. It uses a pointcut to define the specific join point where the aspect's behavior should be applied. The aspect is responsible for validating the game state after each move, checking for a win or tie condition, and displaying the game board accordingly.

By employing AspectJ, the TicTacToe game achieves a modular and decoupled design, improving code readability and maintainability. It allows for the separation of concerns and the reuse of cross-cutting functionalities, resulting in cleaner and more concise code.

# Getting Started
To play the TicTacToe game, follow these steps:

1. Ensure you have Java and AspectJ installed on your machine.
2. Clone repository.
3. Open the project in a Java IDE that allows AspectJ support.
4. Build and compile project.
5. Run the main class TicTacToeApp.
6. Follow on-screen instructions.

# Future Enhancements
- AI opponent: implementing an AI Player to allow single-player gameplay.
- Game Statistics to track Wins, Loses, and ties.
- Network Multiplayer

# Conclusion 
The TicTacToe game showcases the application of AspectJ and aspect-oriented programming concepts in building a classic game implementation. By leveraging AspectJ, the game achieves a modular and extensible design, allowing for the separation of concerns and the reuse of cross-cutting functionalities. With its interactive gameplay and aspect-driven implementation, the TicTacToe game provides an enjoyable and engaging gaming experience.
