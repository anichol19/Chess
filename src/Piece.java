import java.util.ArrayList;

public abstract class Piece {

	private int currRow, currCol;
	private boolean isWhite, wasCaptured, hasMoved;
	
	public abstract ArrayList<Move> findValidMoves(Board board);
	
	public Piece(int row, int col, boolean isWhite)
	{
		currRow = row;
		currCol = col;
		this.isWhite = isWhite;
		wasCaptured = false;
		hasMoved = false;
	}
	
	public int getCol()
	{
		return currCol;
	}
	
	public int getRow()
	{
		return currRow;
	}
	
	public void setCol(int x)
	{
		currCol = x;
	}
	
	public void setRow(int y)
	{
		currRow = y;
	}
	
	public boolean isWhite()
	{
		return isWhite;
	}
	
	public boolean wasCaptured()
	{
		return wasCaptured;
	}
	
	public void captured()
	{
		wasCaptured = true;
	}
	
	public boolean hasMoved()
	{
		return hasMoved;
	}
	
	public void moved()
	{
		hasMoved = true;
	}
}
