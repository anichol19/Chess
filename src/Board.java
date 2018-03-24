
public class Board {
	private Piece[][] board = new Piece[8][8];
	private boolean isWon;
	
	public Board() {
		//Initialize board start
		isWon = false;
	}
	
	public Piece[][] getBoard() {
		return board;
	}
	
}
