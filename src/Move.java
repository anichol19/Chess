public class Move {
	
	public int currR, currC, newR, newC;
	private boolean wasCapture;
	
	public Move(int cr, int cc, int nr, int nc, boolean wasCapture)
	{
		currR = cr;
		currC = cc;
		newR = nr;
		newC = nc;
		this.wasCapture = wasCapture;
	}
	
	public boolean wasCapture() {
		return wasCapture;
	}
	
	public int currR() {
		return currR;
	}
	
	public int currC() {
		return currC;
	}
	
	public int newR() {
		return newR;
	}
	
	public int newC() {
		 return newC;
	}
	
}
