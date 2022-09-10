
public class Queen extends Piece{

	private static boolean ep_able;
	public String color;
	
	public Queen(String color){
		super(ep_able);
		this.color = color;
	}

	// @Override
	public boolean validateMove(Piece[][] board, int currentRow, int currentCol, int newRow, int newCol) {
		//A Queen's move is the same as a Rook's or a Bishop's
		return new Rook(color).validateMove(board, currentRow, currentCol, newRow, newCol) || new Bishop(color).validateMove(board, currentRow, currentCol, newRow, newCol);
	}
	
	public String getColor(){
		return this.color;
	}
	
	public String toString(){
		return color.charAt(0) + "Q";
		
	}

	@Override
	public boolean canMove(Board board, Spot start, Spot end) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
