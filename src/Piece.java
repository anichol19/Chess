
public abstract class Piece {
	
	private int currY, currX;
	private boolean isWhite, isCaptured, hasMoved;
	
	public Piece(int y, int x, boolean isWhite, boolean isCaptured)
	{
		currY = y;
		currX = x;
		this.isWhite = isWhite;
		this.isCaptured = isCaptured;
	}
	
	public int getX()
	{
		return currX;
	}
	
	public int getY()
	{
		return currY;
	}
	
	
}
