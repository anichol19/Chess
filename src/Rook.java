import java.util.ArrayList;

public class Rook extends Piece {

	public Rook(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> possMoves = new ArrayList<Move>();
		int r = this.getRow();
		int c = this.getCol();
		Piece[][] cb = board.getBoard();
		//Upwards Moves
		while((r-1 >= 0) && cb[r-1][c] == null) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r-1 , c, false));
			r--;
		}
		if( (r-1 >= 0) && (cb[r-1][c].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r-1, c, true));
		}
		r = this.getRow();
		c = this.getCol();
		//Downwards Moves
		while((r+1 < 8) && cb[r+1][c] == null) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r+1 , c, false));
			r++;
		}
		if( (r+1 < 8) && (cb[r+1][c].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r+1, c, true));
		}
		r = this.getRow();
		c = this.getCol();
		//Left Moves
		while((c-1 >= 0) && cb[r][c-1] == null) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r , c-1, false));
			c--;
		}
		if( (c-1 >= 0) && (cb[r][c-1].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r, c-1, true));
		}
		r = this.getRow();
		c = this.getCol();
		//Right moves		
		while((c+1 < 8 ) && cb[r][c+1] == null) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r , c+1, false));
			c++;
		}
		if( (c+1 < 8) && (cb[r][c+1].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			possMoves.add(new Move(this.getRow(), this.getCol(), r, c+1, true));
		}
		return possMoves;
	}
	public String toString() {
		return "R";
	}
}
