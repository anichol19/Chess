import java.util.ArrayList;

public class Pawn extends Piece {
	
	public Pawn( int x, int y, boolean isWhite, String image) {
		super(x, y, isWhite, image);
	}
	public ArrayList<Move> findValidMoves(Board board){
		ArrayList<Move> vm = new ArrayList<Move>();
		int row = this.getRow();
		int col = this.getCol();
		Piece[][] cb = board.getBoard();
		//White moving "Up"
		if( this.isWhite() ) {
			//forward movements
			if( ( row - 1 >= 0 ) && cb[row-1][col] == null) {
				vm.add(new Move(row, col, row-1, col , false));
				//Double move if it hasn't moved
				if( !this.hasMoved() && (row - 2 >= 0) && cb[row-2][col] == null) {
					vm.add( new Move(row, col, row-2, col, false));
				}
			}
			//Right capture
			if( (col + 1 < 8) && (row - 1 >= 0) && cb[row-1][col+1] != null && !cb[row-1][col+1].isWhite() ) {
				vm.add( new Move(row, col, row-1, col+1, true));
			}
			//Left capture
			if( (row - 1 >= 0) && (col - 1 >= 0) && cb[row-1][col-1] != null && !cb[row-1][col-1].isWhite() ) {
				vm.add( new Move(row, col, row-1, col-1, true));
			}
		}
		//Black, moving "Down"
		else {
			//forward movements
			if( (row + 1 < 8 ) && cb[row+1][col] == null) {
				vm.add(new Move(row, col, row+1, col , false));
				//Double move if it hasn't moved
				if( !this.hasMoved() && (row + 2  < 8 ) && cb[row+2][col] == null) {
					vm.add( new Move(row, col, row +2, col, false));
				}
			}
			//Right capture
			if( (col + 1 < 8) && (row + 1 < 8) && cb[row+1][col+1] != null && cb[row+1][col+1].isWhite() ) {
				vm.add( new Move(row, col, row+1, col+1, true));
			}
			//Left capture
			if( (col - 1 >= 0) && (row + 1 < 8) && cb[row+1][col-1] != null && cb[row+1][col-1].isWhite() ) {
				vm.add( new Move(row, col, row+1, col-1, true));
			}
		}
		return vm;
	}
}
