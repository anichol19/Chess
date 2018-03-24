import java.util.ArrayList;

public class Queen extends Piece {
	
	public Queen(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> vm = new ArrayList<Move>();
		int row1 = getRow(), row2, col1 = getCol(), col2;
		Piece[][] cb = board.getBoard();
		//Bishop Logic
		//upper right
		row2 = row1 - 1;
		col2 = col1 + 1;
		while (row2 >= 0 && col2 < 8 && cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2--;
			col2++;
			if(row2 < 0 || col2 >= 8) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//upper left
		row2 = row1 - 1;
		col2 = col1 - 1;
		while (row2 >= 0 && col2 >= 0 && cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2--;
			col2--;
			if( row2 < 0 || col2 < 0 ) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//lower right
		row2 = row1 + 1;
		col2 = col1 + 1;
		while (row2 < 8 && col2 < 8 && cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2++;
			col2++;
			if( row2 >= 8 || col2 >= 8 ) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}
		//lower left
		row2 = row1 + 1;
		col2 = col1 - 1;
		while (row2 < 8 && col2 >= 0 && cb[row2][col2] == null)
		{
			vm.add(new Move(row1, col1, row2, col2, false));
			row2++;
			col2--;
			if( row2 >= 8 || col1 < 0 ) {
				break;
			}
			if (cb[row2][col2] != null && (this.isWhite() != cb[row2][col2].isWhite()))
				vm.add(new Move(row1, col1, row2, col2, true));
			else if (cb[row2][col2] != null)
				break;
		}

		//Rook Logic
		int r = this.getRow();
		int c = this.getCol();
		//Upwards Moves
		while((r-1 >= 0) && cb[r-1][c] == null) {
			vm.add(new Move(this.getRow(), this.getCol(), r-1 , c, false));
			r--;
		}
		if( (r-1 >= 0) && (cb[r-1][c].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			vm.add(new Move(this.getRow(), this.getCol(), r-1, c, true));
		}
		r = this.getRow();
		c = this.getCol();
		//Downwards Moves
		while((r+1 < 8) && cb[r+1][c] == null) {
			vm.add(new Move(this.getRow(), this.getCol(), r+1 , c, false));
			r++;
		}
		if( (r+1 < 8) && (cb[r+1][c].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			vm.add(new Move(this.getRow(), this.getCol(), r+1, c, true));
		}
		r = this.getRow();
		c = this.getCol();
		//Left Moves
		while((c-1 >= 0) && cb[r][c-1] == null) {
			vm.add(new Move(this.getRow(), this.getCol(), r , c-1, false));
			c--;
		}
		if( (c-1 >= 0) && (cb[r][c-1].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			vm.add(new Move(this.getRow(), this.getCol(), r, c-1, true));
		}
		r = this.getRow();
		c = this.getCol();
		//Right moves		
		while((c+1 < 8 ) && cb[r][c+1] == null) {
			vm.add(new Move(this.getRow(), this.getCol(), r , c+1, false));
			c++;
		}
		if( (c+1 < 8) && (cb[r][c+1].isWhite() != cb[this.getRow()][this.getCol()].isWhite())) {
			vm.add(new Move(this.getRow(), this.getCol(), r, c+1, true));
		}
		return vm;
	}
	public String toString() {
		return "Q";
	}
}
