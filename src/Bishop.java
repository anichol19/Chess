import java.util.ArrayList;

public class Bishop extends Piece {

	public Bishop(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		int row1 = getRow(), row2, col1 = getCol(), col2;
		ArrayList<Move> vm = new ArrayList<Move>();
		Piece[][] cb = board.getBoard();
		//upper right
		row2 = row1 - 1;
		col2 = col1 + 1;
		while (cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2--;
			col2++;
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//upper left
		row2 = row1 - 1;
		col2 = col1 - 1;
		while (cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2--;
			col2--;
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//lower right
		row2 = row1 + 1;
		col2 = col1 + 1;
		while (cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2++;
			col2++;
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//lower left
		row2 = row1 + 1;
		col2 = col1 - 1;
		while (cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2++;
			col2--;
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
	}
	
	public String toString()
	{
		return "B";
	}
}
