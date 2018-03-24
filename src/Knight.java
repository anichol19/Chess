import java.util.ArrayList;

public class Knight extends Piece {
	
	public Knight(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> possMoves = new ArrayList<Move>();
		int r = this.getRow();
		int c = this.getCol();
		Piece[][] cb = board.getBoard();
		//Up 2
		if( r - 2 >= 0 ) {
			//Left 1
			if( c-1 >= 0) {
				//NonCapture
				if(cb[r-2][c-1] == null) {
					possMoves.add(new Move(r, c, r-2, c-1, false));
				}
				//Capture
				else if( cb[r][c].isWhite() != cb[r-2][c-1].isWhite()) {
					possMoves.add(new Move(r, c, r-2, c-1, true));
				}
			}
			//Right 1
			if( c+1 < 8 ) {
				//NonCapture
				if(cb[r-2][c+1] == null) {
					possMoves.add(new Move(r, c, r-2, c+1, false));
				}
				//Capture
				else if( cb[r][c].isWhite() != cb[r-2][c+1].isWhite()) {
					possMoves.add(new Move(r, c, r-2, c+1, true));
				}
			}
		}
		//down 2
		if( r + 2 < 8 ) {
			//Left 1
			if( c-1 >= 0) {
				//NonCapture
				if(cb[r+2][c-1] == null) {
					possMoves.add(new Move(r, c, r+2, c-1, false));
				}
				//Capture
				else if( this.isWhite() != cb[r+2][c-1].isWhite()) {
					possMoves.add(new Move(r, c, r+2, c-1, true));
				}
			}
			//Right 1
			if( c+1 < 8 ) {
				//NonCapture
				if(cb[r+2][c+1] == null) {
					possMoves.add(new Move(r, c, r+2, c+1, false));
				}
				//Capture
				else if( this.isWhite() != cb[r+2][c+1].isWhite()) {
					possMoves.add(new Move(r, c, r-2, c+1, true));
				}
			}
		}
		//Left 2
		if( c - 2 >= 0 ) {
			//Up 1
			if( r-1 >= 0) {
				//NonCapture
				if(cb[r-1][c-2] == null) {
					possMoves.add(new Move(r, c, r-1, c-2, false));
				}
				//Capture
				else if( this.isWhite() != cb[r-1][c-2].isWhite()) {
					possMoves.add(new Move(r, c, r-1, c-2, true));
				}
			}
			//down 1
			if( r+1 < 8 ) {
				//NonCapture
				if(cb[r+1][c-2] == null) {
					possMoves.add(new Move(r, c, r+1, c-2, false));
				}
				//Capture
				else if( this.isWhite() != cb[r+1][c-2].isWhite()) {
					possMoves.add(new Move(r, c, r+1, c-2, true));
				}
			}
		}
		//Right 2
		if( c + 2 < 8 ) {
			//Up 1
			if( r-1 >= 0) {
				//NonCapture
				if(cb[r-1][c+2] == null) {
					possMoves.add(new Move(r, c, r-1, c+2, false));
				}
				//Capture
				else if( this.isWhite() != cb[r-1][c+2].isWhite()) {
					possMoves.add(new Move(r, c, r-1, c+2, true));
				}
			}
			//down 1
			if( r+1 < 8 ) {
				//NonCapture
				if(cb[r+1][c+2] == null) {
					possMoves.add(new Move(r, c, r+1, c+2, false));
				}
				//Capture
				else if( this.isWhite() != cb[r+1][c+2].isWhite()) {
					possMoves.add(new Move(r, c, r+1, c+2, true));
				}
			}
		}
		return possMoves;
	}
	public String toString() {
		return "N";
	}
}
