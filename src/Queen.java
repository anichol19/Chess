import java.util.ArrayList;

public class Queen extends Piece {
	
	public Queen(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> possMoves = new ArrayList<Move>();
		return possMoves;
	}
	public String toString() {
		return "Q";
	}
}
