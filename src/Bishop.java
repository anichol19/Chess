import java.util.ArrayList;

public class Bishop extends Piece {

	public Bishop(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		//Bishop Logic
		int row1 = getRow(), row2, col1 = getCol(), col2;
		ArrayList<Move> possMoves = new ArrayList<Move>();
		Piece[][] cb = board.getBoard();
		//upper right
		row2 = row1 - 1;
		col2 = col1 + 1;
		while (row2 >= 0 && col2 < 8 && cb[row2][col2] == null)
		{
			possMoves.add(new Move(row1, col1, row2, col2, false));
			row2--;
			col2++;
			if(row2 < 0 || col2 >= 8) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				possMoves.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//upper left
		row2 = row1 - 1;
		col2 = col1 - 1;
		while (row2 >= 0 && col2 >= 0 && cb[row2][col2] == null)
		{
			possMoves.add(new Move(row1, col1, row2, col2, false));
			row2--;
			col2--;
			if( row2 < 0 || col2 < 0 ) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				possMoves.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//lower right
		row2 = row1 + 1;
		col2 = col1 + 1;
		while (row2 < 8 && col2 < 8 && cb[row2][col2] == null)
		{
			possMoves.add(new Move(row1, col1, row2, col2, false));
			row2++;
			col2++;
			if( row2 >= 8 || col2 >= 8 ) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				possMoves.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//lower left
		row2 = row1 + 1;
		col2 = col1 - 1;
		while (row2 < 8 && col2 >= 0 && cb[row2][col2] == null)
		{
			possMoves.add(new Move(row1, col1, row2, col2, false));
			row2++;
			col2--;
			if( row2 >= 8 || col1 < 0 ) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				possMoves.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		return possMoves;
	}
	
	public String toString()
	{
		return "B";
	}
}
