public class Board {
	static Spot[][] boxes;

	public Board()
	{
		Board.resetBoard();
	}

	public Spot getBox(int x, int y)
	{

		if (x < 0 || x > 4 || y < 0 || y > 4) {
			try {
        throw new Exception("Index out of bound");
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
		}

		return boxes[x][y];
	}

	public static void resetBoard()
	{
		// initialize white pieces
		boxes[0][0] = new Spot(0, 0, new Rook("white"));
		boxes[0][1] = new Spot(0, 1, new Knight(true));
		boxes[0][2] = new Spot(0, 2, new Bishop("white"));
		boxes[0][3] = new Spot(0, 3, new King(true));
		//...
		boxes[1][0] = new Spot(1, 0, new Pawn("white"));
		boxes[1][1] = new Spot(1, 1, new Pawn("white"));
		boxes[1][2] = new Spot(1, 2, new Pawn("white"));
		boxes[1][3] = new Spot(1, 3, new Pawn("white"));
		//...

		// initialize black pieces
		boxes[4][0] = new Spot(4, 0, new Rook("black"));
		boxes[4][1] = new Spot(4, 1, new Knight(false));
		boxes[4][2] = new Spot(4, 2, new Bishop("black"));
		boxes[4][3] = new Spot(4, 3, new King(false));
		//...
		boxes[3][0] = new Spot(3, 0, new Pawn("black"));
		boxes[3][1] = new Spot(3, 1, new Pawn("black"));
		boxes[3][2] = new Spot(3, 2, new Pawn("black"));
		boxes[3][3] = new Spot(3, 3, new Pawn("black"));
		//...

		// initialize remaining boxes without any piece
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				boxes[i][j] = new Spot(i, j, null);
			}
		}
	}

	public static void main(String args[]) {
		resetBoard();
	}
}
