public class Board {
	Spot[][] boxes;

	public Board()
	{
		this.resetBoard();
	}

	public Spot getBox(int x, int y)
	{

		if (x < 0 || x > 5 || y < 0 || y > 5) {
			try {
        throw new Exception("Index out of bound");
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
		}

		return boxes[x][y];
	}

	public void resetBoard()
	{
		// initialize white pieces
		boxes[0][0] = new Spot(0, 0, new Rook(true));
		boxes[0][1] = new Spot(0, 1, new Knight(true));
		boxes[0][2] = new Spot(0, 2, new Bishop(true));
		//...
		boxes[1][0] = new Spot(1, 0, new Pawn(true));
		boxes[1][1] = new Spot(1, 1, new Pawn(true));
		//...

		// initialize black pieces
		boxes[4][0] = new Spot(7, 0, new Rook(false));
		boxes[4][1] = new Spot(7, 1, new Knight(false));
		boxes[4][2] = new Spot(7, 2, new Bishop(false));
		//...
		boxes[3][0] = new Spot(6, 0, new Pawn(false));
		boxes[3][1] = new Spot(6, 1, new Pawn(false));
		//...

		// initialize remaining boxes without any piece
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				boxes[i][j] = new Spot(i, j, null);
			}
		}
	}
}
