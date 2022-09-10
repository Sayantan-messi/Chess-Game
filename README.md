# Chess-Game

The main classes will be:

1)Spot: A spot represents one block of the 5x5 grid and an optional piece.

2)Piece: The basic building block of the system, every piece will be placed on a spot. Piece class is an abstract class. The extended classes (Pawn, King, Queen, Rook, Knight, Bishop) implements the abstracted operations.

3)Board: Board is an 8×8 set of boxes containing all active chess pieces.

4)Player: Player class represents one of the participants playing the game.

5)Move: Represents a game move, containing the starting and ending spot. The Move class will also keep track of the player who made the move.

6)Game: This class controls the flow of a game. It keeps track of all the game moves, which player has the current turn, and the final result of the game.

7)At each step the players have 4 movement options : LEFT,RIGHT,UP,DOWN.


The edges cases such as:

- If the chess players goes beyond the board then error message is returned.

- If any of the player wins then the game is stopped and can be re-started from the beginning

- At a time only 2 players can play

- If any wrong move is players immidiately error message is printed.

