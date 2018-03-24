public class Move {
	
	public int currY, currX, newY, newX;
	private boolean wasCaptured;
	
	public Move(int cy, int cx, int ny, int nx, boolean wasCaptured)
	{
		currY = cy;
		currX = cx;
		newY = ny;
		newX = nx;
		this.wasCaptured = wasCaptured;
	}
	
}
