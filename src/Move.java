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
	
	public String toString() {
		String here = "";
		for( int i = 0 ; i < 8 ; i++ ) {
			for( int j = 0 ; j < 8 ; j++ ) {
				if( i == this.currR() && j == this.currC()) {
					here += "[S]";
				}
				else if( i == this.newR() && j == this.newC()){
					here += "[F]";
				}
				else {
					here += "[ ]";
				}
			}
			here += "\n";
		}
		return here;
	}
	
}
