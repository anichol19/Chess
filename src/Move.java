public class Move {
	
	public int currR, currC, newR, newC;
	private boolean wasCaptured;
	
	public Move(int cr, int cc, int nr, int nc, boolean wasCaptured)
	{
		currR = cr;
		currC = cc;
		newR = nr;
		newC = nc;
		this.wasCaptured = wasCaptured;
	}
	
}
