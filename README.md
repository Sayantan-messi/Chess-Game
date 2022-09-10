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


SCREEN SHOT:

INITIAL POSITION:

![image](https://user-images.githubusercontent.com/59511017/189490795-92938703-b5d4-45b4-8962-c470f5e2c50f.png)

INVALID POSITION:

![image](https://user-images.githubusercontent.com/59511017/189490860-033af447-7ace-4f7c-aec6-6e5cc0b90603.png)

MAKE A VALID MOVE AND PRINT NEW BOARD STATUS:

![image](https://user-images.githubusercontent.com/59511017/189490958-0c87608c-0a16-40b6-957a-12519c070725.png)
