import java.util.ArrayList;

public class Knight extends Piece {
	
	public Knight(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> possMoves = new ArrayList<Move>();
		return possMoves;
	}
	public String toString() {
		return "N";
	}
}
