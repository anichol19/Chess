import java.util.ArrayList;

public abstract class Piece {

	private int currY, currX;
	private boolean isWhite, wasCaptured, hasMoved;
	
	public abstract ArrayList<Move> findValidMoves(Board board);
	
	public Piece(int y, int x, boolean isWhite)
	{
		currY = y;
		currX = x;
		this.isWhite = isWhite;
		wasCaptured = false;
		hasMoved = false;
	}
	
	public int getX()
	{
		return currX;
	}
	
	public int getY()
	{
		return currY;
	}
	
	public void setX(int x)
	{
		currX = x;
	}
	
	public void setY(int y)
	{
		currY = y;
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
